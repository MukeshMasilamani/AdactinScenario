package com.mavfirst;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
public BookHotel() {
	PageFactory.initElements(driver, this);
}
@FindBy (name = "first_name")
private WebElement typeFirstName ;

@FindBy (name = "last_name")
private WebElement typeLastName ;

@FindBy (name = "address")
private WebElement typeAddress ;

@FindBy (name = "cc_num")
private WebElement entercreditCardNo ;

@FindBy (id = "cc_type")
private WebElement selectCardType ;

@FindBy (id = "cc_exp_month")
private WebElement selectExpireMonth ;

@FindBy (id = "cc_exp_year")
private WebElement selectExpireYear ;

@FindBy (name = "cc_cvv")
private WebElement enterCvvNo;

@FindBy (name = "book_now")
private WebElement clickBookNowBtn ;

@FindBy (xpath = "//input [@name ='cancel']")
private WebElement clickCancelBtn;

public WebElement getTypeFirstName() {
	return typeFirstName;
}

public WebElement getTypeLastName() {
	return typeLastName;
}

public WebElement getTypeAddress() {
	return typeAddress;
}

public WebElement getEntercreditCardNo() {
	return entercreditCardNo;
}

public WebElement getSelectCardType() {
	return selectCardType;
}

public WebElement getSelectExpireMonth() {
	return selectExpireMonth;
}

public WebElement getSelectExpireYear() {
	return selectExpireYear;
}

public WebElement getEnterCvvNo() {
	return enterCvvNo;
}

public WebElement getClickBookNowBtn() {
	return clickBookNowBtn;
}

public WebElement getClickCancelBtn() {
	return clickCancelBtn;
}





}
