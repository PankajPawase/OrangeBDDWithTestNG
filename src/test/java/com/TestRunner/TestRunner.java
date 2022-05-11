package com.TestRunner;





import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(		
		features={"AllFeatureFiles"},
		glue={"com.StepDefination"},
		monochrome=true,
		dryRun=false,
		plugin={"html:target/report.html"}
		
		)


public class TestRunner{

}
