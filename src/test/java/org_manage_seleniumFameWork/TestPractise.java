package org_manage_seleniumFameWork;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPractise {

	@Test(priority = 1)
	public void test() {
//		Assert.fail();
		Reporter.log("test 1",true);
	}
	
	@Test(alwaysRun =true)
	public void test1() {
		Assert.fail();
		Reporter.log("test 2",true);
	}
}
