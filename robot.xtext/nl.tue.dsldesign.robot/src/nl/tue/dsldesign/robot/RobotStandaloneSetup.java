/*
 * generated by Xtext 2.27.0
 */
package nl.tue.dsldesign.robot;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class RobotStandaloneSetup extends RobotStandaloneSetupGenerated {

	public static void doSetup() {
		new RobotStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
