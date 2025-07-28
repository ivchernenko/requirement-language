package su.nsk.iae.rpl.generator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import su.nsk.iae.rpl.RPLStandaloneSetup;
import su.nsk.iae.rpl.invpatterngenerator.ImportedTheory;
import su.nsk.iae.rpl.invpatterngenerator.IsabelleTheoryGenerator;
import su.nsk.iae.rpl.invpatterngenerator.PatternGenerator;
import su.nsk.iae.rpl.rPL.*;

public class Main {
	
	static String FILE_EXTENSION = ".rpl";

	public static void main(String[] args) {
		Injector injector = new RPLStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		String fileName = null;
		String commonExtraInv = null;
		boolean patternGen = false;
		boolean scriptGen = false;
		for (int i = 0; i < args.length; i++) {
			if (args[i].endsWith(FILE_EXTENSION))
				fileName = args[i];
			else if (args[i].equals("-p"))
				patternGen = true;
			else if (args[i].equals("-s"))
				scriptGen = true;
			else if (args[i].equals("-cei"))
				commonExtraInv = args[i + 1];
		}
		if (fileName == null) {
			System.err.println("input file is not specified.");
			System.exit(1);
		}
		if (patternGen)
			main.generatePatternsAndLemmas(fileName);
		else {
			main.generateScripts(fileName, commonExtraInv);
		}
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private RPLGenerator generator;
	
	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void generatePatternsAndLemmas(String fileName) {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		URI uri = URI.createFileURI(fileName);
		Resource resource = set.getResource(uri, true);
		try {
			Model model = (Model) resource.getContents().get(0);
			List<Element> elements = model.getElements();
			int index = fileName.indexOf('.');
			String name = fileName.substring(0, index);
			String outputFileName = name + "_Patterns";
			RPLFactory factory = RPLFactory.eINSTANCE;
			Model genModel = factory.createModel();
			List<Import> imports = genModel.getImports();
			IsabelleTheoryGenerator theoryGenerator = new IsabelleTheoryGenerator(outputFileName);
			for (Import importElement: model.getImports()) {
				Import importCopy = factory.createImport();
				String importURI = importElement.getImportURI();
				importCopy.setImportURI(importElement.getImportURI());
				imports.add(importCopy);
				String importedFileName = importURI.substring(importURI.lastIndexOf('/') + 1);
				String theoryName = importedFileName.substring(0, importedFileName.lastIndexOf('.'));
				String session = importElement.getSession();
				theoryGenerator.addImportedTheory(new ImportedTheory(session, theoryName));
			}
			List<Element> genElements = genModel.getElements();
			PatternGenerator.setGeneratedASTElements(genElements);
			PatternGenerator.setTheoryGenerator(theoryGenerator);
			for (Element element: elements) {
				if (element instanceof DerivedRequirementPattern pattern && pattern.getDefinition() != null) {
					PatternGenerator.generatePatternsAndLemmas(pattern);
				}				
			}
			theoryGenerator.generateTheory();
			URI genUri = URI.createFileURI(outputFileName + ".rpl");
			Resource genResource = set.createResource(genUri);
			genResource.getContents().add(genModel);
			genResource.save(new HashMap<>());
		}
		catch (Exception e) {
			System.out.println(resource.getErrors());
			e.printStackTrace();
		}
		System.out.println("Code generation finished.");
	}
	
	protected void generateScripts(String fileName, String commonExtraInv) {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		URI uri = URI.createFileURI(fileName);
		Resource resource = set.getResource(uri, true);
		Scanner scanner = new Scanner(System.in);
		String inputVars = scanner.nextLine();
		int index = fileName.lastIndexOf('.');
		String requirementTheory = fileName.substring(0, index);
		generator.setGlobalParameters(commonExtraInv, inputVars, requirementTheory);
		fileAccess.setOutputPath(".");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		try {
			while (scanner.hasNextLine()) {
				String VCTheoryAndRange = scanner.nextLine();
				String[] parameters = VCTheoryAndRange.split(" ");
				String VCTheory = parameters[0];
				int start = Integer.parseInt(parameters[1]);
				int end = Integer.parseInt(parameters[2]);
				generator.setVCTheory(VCTheory, start, end);
				generator.doGenerate(resource, fileAccess, context);
			}
			scanner.close();
		}
		catch (Exception e) {			
			e.printStackTrace();
			 System.out.println(resource.getErrors());
		}

		System.out.println("Code generation finished.");
	}
}