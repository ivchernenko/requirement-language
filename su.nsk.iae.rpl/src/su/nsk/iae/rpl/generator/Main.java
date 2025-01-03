package su.nsk.iae.rpl.generator;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;


import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import su.nsk.iae.rpl.RPLStandaloneSetup;

import su.nsk.iae.rpl.rPL.*;
import su.nsk.iae.rpl.rPL.impl.InnerFormulaImpl;

public class Main {

	public static void main(String[] args) {
		Injector injector = new RPLStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		main.runGenerator();
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	protected void runGenerator() {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		URI uri = URI.createFileURI("example.rpl");
		Resource resource = set.getResource(uri, true);
		try {
			//resource.load(in, set.getLoadOptions());
			
			Model model = (Model) resource.getContents().get(0);
			var derReqOpt = model.getElements().stream()
			.filter(e -> (e instanceof DerivedRequirementPattern)).findFirst();
			if (derReqOpt.isPresent()) {
				DerivedRequirementPattern derReq = (DerivedRequirementPattern) 
						derReqOpt.get();
				var einv = derReq.getExtraInvPattern();
				System.out.println(einv);
			}
			
			 System.out.println(resource.getErrors());
			
		}
		catch (Exception e) {			
			e.printStackTrace();
			 System.out.println(resource.getErrors());
		}
		
		
		// Validate the resource
		

		// Configure and start the generator

		System.out.println("Code generation finished.");
	}
	
	private void printTerm(Term t) {
		if (t instanceof Constant c) {
			if (c.getNum() != null)
				System.out.print(c.getNum());
			else if (c.getBool() != null)
				System.out.print(c.getBool());
		}
		else if (t instanceof FunApplication fa) {
			System.out.print("" + fa.getFnParam().getName() + "(" + fa.getState()
			+ ")");
		}
		else if (t instanceof PrimaryTerm pt) {
			if (pt.getVariable() != null && pt.getState() == null)
				System.out.print(pt.getVariable().getName());
			else if (pt.getVariable() != null)
				System.out.print("" + pt.getState().getName() + "["
			+ pt.getVariable().getName() + "]");
		}
		else if (t instanceof EqTerm et) {
			printTerm(et.getLeft());
			System.out.print(et.getEqPred().getName());
			printTerm(et.getRight());
		}
		else if (t instanceof ConjunctionTerm et) {
			printTerm(et.getLeft());
			System.out.print("/\\");
			printTerm(et.getRight());
		}
		else if (t instanceof Term et) {
			printTerm(et.getLeft());
			System.out.print("\\/");
			printTerm(et.getRight());
		}
	}
}