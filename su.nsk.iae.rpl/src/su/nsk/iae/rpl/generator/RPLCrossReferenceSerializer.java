package su.nsk.iae.rpl.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;

import su.nsk.iae.rpl.rPL.ConstantParameter;
import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.RegularFormulaParameter;
import su.nsk.iae.rpl.rPL.SimpleFormulaParameter;
import su.nsk.iae.rpl.rPL.UpdateStateVariable;
import su.nsk.iae.rpl.rPL.Variable;

public class RPLCrossReferenceSerializer extends CrossReferenceSerializer {

	@Override
	public String serializeCrossRef(EObject semanticObject, CrossReference crossref, EObject target, INode node,
			Acceptor errors) {
		if (target instanceof UpdateStateVariable state)
			return state.getName();
		if (target instanceof Variable cParam)
			return cParam.getName();
		if (target instanceof FunctionalParameter fnParam)
			return fnParam.getName();
		if (target instanceof SimpleFormulaParameter fmParam)
			return fmParam.getName();
		if (target instanceof RegularFormulaParameter fmParam)
			return fmParam.getName();
		return super.serializeCrossRef(semanticObject, crossref, target, node, errors);
	}

	@Override
	protected String getCrossReferenceNameFromScope(EObject semanticObject, CrossReference crossref, EObject target,
			IScope scope, Acceptor errors) {
		return super.getCrossReferenceNameFromScope(semanticObject, crossref, target, scope, errors);
	}
	
	

}
