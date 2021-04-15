package com.mavfirst;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage extends BaseClass{
public BookedItineraryPage() {
	PageFactory.initElements(driver, this);
	}
@FindBy (name = "check_all")
private WebElement clickOrderIdBtn ;

@FindAll ( {	
@FindBy (xpath = "//input[@value='Cancel Selected']"),
@FindBy (xpath = "(//input[@class='reg_button'])[1]"),
@FindBy (xpath = "(//input[@type='submit'])[2]")
} )
private WebElement clickCancelSelectedBtn ;

@FindBy (name = "search_hotel")
private WebElement clickSearchHotelBtn;

@FindBy (xpath = "//input [@name = 'logout']")
private WebElement clickLogoutBtn;

@FindBy (id = "order_id_text")
private WebElement typeOrderId;

@FindBy (name = "search_hotel_id")
private WebElement clickGoBtn;

public WebElement getClickOrderIdBtn() {
	return clickOrderIdBtn;
}

public WebElement getClickCancelSelectedBtn() {
	return clickCancelSelectedBtn;
}

public WebElement getClickSearchHotelBtn() {
	return clickSearchHotelBtn;
}

public WebElement getClickLogoutBtn() {
	return clickLogoutBtn;
}

public WebElement getTypeOrderId() {
	return typeOrderId;
}

public WebElement getClickGoBtn() {
	return clickGoBtn;
}

 
}



