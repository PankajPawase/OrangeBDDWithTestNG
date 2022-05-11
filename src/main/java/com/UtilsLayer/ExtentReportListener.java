package com.UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportListener extends ExtentReportSetup implements ITestListener {
	public static ExtentTest extenttest;

	public void onStart(ITestContext Context) {
		ExtentReportSetup.extentReportSetup();
	}

	public void onTestStart(ITestResult result) {
		extenttest = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(
				UtilsClass.ScreenShot("\\PassScreenShot\\" + result.getMethod().getMethodName()));
	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(
				UtilsClass.ScreenShot("\\FailedScreenShot\\" + result.getMethod().getMethodName()));

	}

	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, result.getMethod().getMethodName());

	}

	public void onFinish(ITestContext Context) {
		extent.flush();

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

}
