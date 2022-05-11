package com.UtilsLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.BaseClass.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportSetup extends BaseClass {
	public static ExtentReports extent;
	public static ExtentSparkReporter sparksReporter;
	public static ExtentTest extenttest;

	public static ExtentReports extentReportSetup() {
		String DateTime = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		sparksReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\Extentreport" + DateTime);
		extent = new ExtentReports();
		sparksReporter.config().setTheme(Theme.STANDARD);
		sparksReporter.config().setDocumentTitle("PIMPage Functionality with Cucumber-TestNg");
		sparksReporter.config().setReportName("Softech Classes");
		extent.attachReporter(sparksReporter);
		return extent;
	}

}
