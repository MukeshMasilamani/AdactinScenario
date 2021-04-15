package com.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "@src\\\\test\\\\resources\\\\FailedTestCases\\\\failed.txt" , 
glue = "com.stepfile",
monochrome = true ,
plugin = {"json:target\\Report\\adac.json","rerun:src\\test\\resources\\FailedTestCases\\failed.txt"})
public class Rerunner {

}