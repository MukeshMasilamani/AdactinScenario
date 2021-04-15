package com.stepfile;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mavfirst.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
@Before	
public void beforeScenario() {
	
	 toBrowserlaunchChrome();
	 toMax();
	 toImplicitWait(30);
	 

}
@After
public void afterScenario(Scenario s) throws IOException {

	if (s.isFailed()) {
		TakesScreenshot tk = (TakesScreenshot) driver ;
		byte[] ss = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(ss, "image/png");	
	}
	
	
//	String file = s.getName();
//	String fileName = file.replace(" ", "_");
//	toGetScreenShot("C:\\Users\\ram\\eclipse-workspace\\AdactinSce\\snapshot\\"+fileName+".png" );
}
}
