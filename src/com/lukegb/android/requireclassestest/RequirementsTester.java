package com.lukegb.android.requireclassestest;

public class RequirementsTester {
	private final static String[] requiredClasses = {
			"android.nfc.tech.IsoPcdA",
			"android.nfc.tech.IsoPcdB"
	};
	
	private static Boolean lastCheckState = null;

	private static boolean allClassesExist() {
		// we go through and try to check all of the classes:
		try {
			for (String requiredClass : requiredClasses) {
				Class.forName(requiredClass);

			}
		} catch (ClassNotFoundException e) {
			return false;
		}
		
		// if we got to the end without a ClassNotFoundException, we're golden!
		return true;
	}

	public static boolean isAppSupported() {
		if (lastCheckState != null)
			return lastCheckState;
		
		lastCheckState = allClassesExist();
		return lastCheckState;
	}
}
