package com.mavfirst;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaseClass {
public BookingConfirmationPage() {
	PageFactory.initElements(driver, this);
}
@FindBy (id = "search_hotel")
private WebElement clickSearchHotel;

@FindBy (id = "my_itinerary")
private WebElement clickMyItinerary ;

@FindBy (id = "logout")
private WebElement clickLogout ;

public WebElement getClickSearchHotel() {
	return clickSearchHotel;
}

public WebElement getClickMyItinerary() {
	return clickMyItinerary;
}

public WebElement getClickLogout() {
	return clickLogout;
}




}
