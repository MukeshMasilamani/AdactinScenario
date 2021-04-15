package com.mavfirst;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
	PageFactory.initElements(driver, this);
}
@FindBy (id = "radiobutton_0")
private WebElement select ;

@FindBy (xpath = "//input[@value ='Continue']" )
private WebElement clickContinue;
	
@FindBy (xpath = "//input[@value ='Cancel']")
private WebElement cancel ;

public WebElement getSelect() {
	return select;
}

public WebElement getClickContinue() {
	return clickContinue;
}

public WebElement getCancel() {
	return cancel;
}


	
	
	
	
	
	
	
	
	
}
