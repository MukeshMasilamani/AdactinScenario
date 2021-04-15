package com.mavfirst;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(name="username")
private WebElement txtuser ;
@FindBy(id = "password")
private WebElement txtPass ;
@FindBy(id = "login")
private WebElement login;

public WebElement getTxtuser() {
	return txtuser;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getLogin() {
	return login;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 