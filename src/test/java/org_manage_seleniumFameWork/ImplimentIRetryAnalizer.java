package org_manage_seleniumFameWork;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ImplimentIRetryAnalizer implements IRetryAnalyzer {
	int count =0;
	int rang=4;
	@Override
	public boolean retry(ITestResult arg0) {
		if (count<rang) {
			count++;
			return true;
		}
		return false;
	}

}
