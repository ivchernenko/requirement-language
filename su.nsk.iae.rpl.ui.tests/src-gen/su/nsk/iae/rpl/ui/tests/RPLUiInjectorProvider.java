/*
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import su.nsk.iae.rpl.ui.internal.RplActivator;

public class RPLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RplActivator.getInstance().getInjector("su.nsk.iae.rpl.RPL");
	}

}
