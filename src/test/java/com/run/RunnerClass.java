package com.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.mavfirst.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (features ="src\\test\\resources",
glue = "com.stepfile" , 
dryRun = false , 
monochrome = true ,
strict = false,
plugin = {"json:target\\Report\\adac.json","rerun:src\\test\\resources\\FailedTestCases\\failed.txt"})
public class RunnerClass extends BaseClass { 
	
	@AfterClass
	public static void jvmReportGenerate() {
		
		jvmReport(System.getProperty("user.dir")+"\\target\\Report\\adac.json");


	

}

}