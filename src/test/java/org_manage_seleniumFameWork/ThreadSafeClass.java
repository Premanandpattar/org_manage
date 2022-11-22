package org_manage_seleniumFameWork;

import com.aventstack.extentreports.ExtentTest;

public class ThreadSafeClass {
	
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	public static ExtentTest getTest() {
		return test.get();
	}
	
	public static void setTest(ExtentTest sTest) {
		test.set(sTest);
	}

}
