package com.mavfirst;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//span[text()='Check-Out Date shall be after than Check-In Date']")
	private WebElement dateError ;
	
	public WebElement getDateError() {
		return dateError;
	}

	@FindBy (xpath = "//td[text() ='Confirm Password']")
	private WebElement confirmText ;
	
	@FindBy (xpath = "//a[text() ='New User Register Here']")
	private WebElement clickRegisterLink ;
	
	@FindBy (xpath ="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement errorMsg;

	@FindBy (xpath = "//td[text()='Location']")
	private WebElement assertText ;
	
	@FindBy (xpath = "//select[@name='location']")
	private WebElement location ;
	
	@FindBy (xpath = "//select[@name='hotels']")
	private WebElement hotels ;
	
	@FindBy (id = "room_type")
	private WebElement roomType ;
	
	@FindBy (id = "room_nos")
	private WebElement noOfRooms;
	
	@FindBy (id = "datepick_in")
	private WebElement checkInDate ;
	
	@FindBy (name = "datepick_out")
	private WebElement checkOutdate;
	
	@FindBy (id = "adult_room")
	private WebElement adultPerRoom ;
	
	@FindBy (id = "child_room")
	private WebElement childPerRoom ;
	
	@FindBy (id = "Submit")
	private WebElement search ;
	
	@FindBy (id = "Reset")
	private WebElement reset ;
	
	@FindBy (xpath = "//td[text()='Welcome to Adactin Group of Hotels']")
	private WebElement text;
	

	
	
	
	public WebElement getText() {
		return text;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutdate() {
		return checkOutdate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}

	public WebElement getAssertText() {
		return assertText;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getClickRegisterLink() {
		return clickRegisterLink;
	}

	public WebElement getConfirmText() {
		return confirmText;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
