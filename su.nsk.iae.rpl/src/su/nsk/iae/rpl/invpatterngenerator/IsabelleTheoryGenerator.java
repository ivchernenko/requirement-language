package su.nsk.iae.rpl.invpatterngenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IsabelleTheoryGenerator {
	List<Object> theoryElements = new ArrayList<>();
	String theoryName;
	List<ImportedTheory> importedTheories = new ArrayList<>();
	
	public IsabelleTheoryGenerator(String theoryName) {
		this.theoryName = theoryName;
	}
	
	public void addImportedTheory(ImportedTheory theory) {
		importedTheories.add(theory);
	}

	public void addTheoryElement(Object element) {
		theoryElements.add(element);
	}
	
	public void generateTheory() throws IOException {
		FileWriter writer = new FileWriter(theoryName + ".thy");
		writer.write(generateTheoryHeader());
		for (Object element: theoryElements) {
			writer.write(element.toString() + "\n\n");
			
		}
		writer.write(generateTheoryEnd());
		writer.close();
	}

	private String generateTheoryEnd() {
		return "end\n";
	}

	private String generateTheoryHeader() {
		StringBuilder theoryHeader = new StringBuilder("theory ").append(theoryName)
				.append(" imports ");
		for (ImportedTheory theory: importedTheories)
			theoryHeader.append(theory).append(' ');
		theoryHeader.append("\nbegin\n\n");
		return theoryHeader.toString();		
	}

}
