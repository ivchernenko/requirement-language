/*
 * generated by Xtext 2.36.0
 */
package su.nsk.iae.rpl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import su.nsk.iae.rpl.ui.internal.RplActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RPLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(RplActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		RplActivator activator = RplActivator.getInstance();
		return activator != null ? activator.getInjector(RplActivator.SU_NSK_IAE_RPL_RPL) : null;
	}

}