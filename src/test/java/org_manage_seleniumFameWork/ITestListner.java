package org_manage_seleniumFameWork;

import java.awt.event.ItemListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ITestListner implements ITestListener {

	
	private ExtentReports reports;
	@Override
	public void onStart(ITestContext arg0) {
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./reporter/extent.html");
		sparkReporter.config().setDocumentTitle("org_manage");
		sparkReporter.config().setReportName("org_manage");
		sparkReporter.config().setTheme(Theme.DARK);
		
		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("author", "Prem");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		ThreadSafeClass.getTest().fail(arg0.getMethod().getMethodName()+ "is failed");
		ThreadSafeClass.getTest().fail(arg0.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		ThreadSafeClass.getTest().skip(arg0.getMethod().getMethodName()+ "is skiped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		 ExtentTest test = reports.createTest(arg0.getMethod().getMethodName());
		ThreadSafeClass.setTest(test);
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		ThreadSafeClass.getTest().pass(arg0.getMethod().getMethodName()+ "is Passed");
		
		
	}
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		reports.flush();
		
	}

}
