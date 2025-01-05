package su.nsk.iae.rpl.invpatterngenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import su.nsk.iae.rpl.rPL.FunctionalParameter;
import su.nsk.iae.rpl.rPL.RPLFactory;
import su.nsk.iae.rpl.rPL.impl.RPLFactoryImpl;

public class FunctionalParameterList {
		Map<String, Integer> paramNameCounter = new HashMap<>();
		List<FunctionalParameter> params;
		
		FunctionalParameter renemeAndAddFnParam(FunctionalParameter fnParam) {
			String name = fnParam.getName();
			Integer number = paramNameCounter.get(name);
			int n;
			if (number == null)
				n = 0;
			else n = number + 1;
			paramNameCounter.put(name,  n);
			RPLFactory factory = RPLFactoryImpl.init();
			FunctionalParameter renamed = factory.createFunctionalParameter();
			renamed.setName(name + '_' + n);
			params.add(renamed);
			return renamed;
		}
		
		List<FunctionalParameter> renameAllFnParams(List<FunctionalParameter> original) {
			List<FunctionalParameter> renamedFnParams = new ArrayList<>();
			for (FunctionalParameter fnParam: original) {
				FunctionalParameter renamed = renemeAndAddFnParam(fnParam);
				renamedFnParams.add(renamed);
			}
			return renamedFnParams;
		}
}
