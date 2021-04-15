package com.stepfile;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mavfirst.BaseClass;
import com.mavfirst.LoginPage;
import com.mavfirst.SearchHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	public static LoginPage l ;
	public static SearchHotelPage search ;
	public static Map<String, String> map ;
	
	@Given("User navigate to adaction login page")
	public void user_navigate_to_adaction_login_page() {
	 toLaunchUrl("http://adactinhotelapp.com/");
	  
	}
	@When("User enter username and password")
	public void user_enter_username_and_password(DataTable d) {
	    
		Map<String, String> map = d.asMap(String.class, String.class);
		String user = map.get("username");
		String pass = map.get("password");
		l = new LoginPage();
		
		toSendKeys(l.getTxtuser(), user);
		toSendKeys(l.getTxtPass(), pass);
	
	}

	@When("User click login button")
	public void user_click_login_button() {
		toClick(l.getLogin());
	}

	@Then("User should navigate to seacrh hotel page")
	public void user_should_navigate_to_seacrh_hotel_page() throws InterruptedException {
		
		search = new SearchHotelPage();
		WebElement text = search.getAssertText();
		System.out.println(text.getText());
		Assert.assertEquals("Location* ", text.getText());
		System.out.println("Given testcase passed");
		
	}




@When("User enter invalid user name and password")
public void user_enter_invalid_user_name_and_password(DataTable d) {
 Map<String, String> map = d.asMap(String.class, String.class);
 String user2 = map.get("username");
 String pass2 = map.get("password");
 
 l = new LoginPage();
 toSendKeys(l.getTxtuser(), user2);
 toSendKeys(l.getTxtPass(), pass2);
 
}

@When("User Click login button")
public void user_Click_login_button() {
	toClick(l.getLogin());
}

@Then("User get error message is displayed in login page")
public void user_get_error_message_is_displayed_in_login_page() {
	search = new SearchHotelPage();
	WebElement errorMsg = search.getErrorMsg();
	System.out.println(errorMsg.getText());
	Assert.assertEquals("Invalid Login details or Your Password might have expired. Click here to reset your password", errorMsg.getText());
	System.out.println("Given testcase 2 passed");
}

@When("clicking the new user register here link")
public void clicking_the_new_user_register_here_link() {
	search = new SearchHotelPage();
	toClick(search.getClickRegisterLink());
}

@Then("user should navaigate to new registraion page")
public void user_should_navaigate_to_new_registraion_page() {
	search = new SearchHotelPage();
	WebElement confirmMsg = search.getConfirmText();
	System.out.println(confirmMsg.getText());
	Assert.assertEquals("Confirm Password* ", confirmMsg.getText());
	System.out.println("Given testcase 3 passed");
}

@Given("User navigate to login page and enter valid username and password and navigate to Search hotel page")
public void user_navigate_to_login_page_and_enter_valid_username_and_password_and_navigate_to_Search_hotel_page(DataTable d) {
	   
	 		toLaunchUrl("http://adactinhotelapp.com/");		
	 		Map<String, String> map = d.asMap(String.class, String.class);
			String user3 = map.get("username");
			String pass3 = map.get("password");
			l = new LoginPage();
			
		
			toSendKeys(l.getTxtuser(), user3);
			toSendKeys(l.getTxtPass(), pass3);
			toClick(l.getLogin());
}

@When("User enter location, hotels , room type and no of rooms.")
public void user_enter_location_hotels_room_type_and_no_of_rooms() throws IOException {
	
	map = excelRead("TC1");
	String location = map.get("location");
	String hotel = map.get("hotel");
	String roomtype = map.get("room type");
	String noOfRooms = map.get("nor");

	
	
	search = new SearchHotelPage();
	dropAndDownSelectByValue(search.getLocation(), location);
	dropAndDownSelectByValue(search.getHotels(), hotel);
	dropAndDownSelectByValue(search.getRoomType(), roomtype);
	dropAndDownSelectByValue(search.getNoOfRooms(), noOfRooms);
	
}

@When("User enter the check-out date field before date than check-in date.")
public void user_enter_the_check_out_date_field_before_date_than_check_in_date() throws IOException {
	map = excelRead("TC1");
	
	String datein = map.get("check");
	String dateout = map.get("check out");
	toClear(search.getCheckInDate());
	toSendKeys(search.getCheckInDate(), datein);
	toClear(search.getCheckOutdate());
	toSendKeys(search.getCheckOutdate(), dateout);
	
}

@When("User enter adults per room and children per room details")
public void user_enter_adults_per_room_and_children_per_room_details() throws IOException {
	map = excelRead("TC1");
	String adult = map.get("adult");
	String child = map.get("child");
	dropAndDownSelectByValue(search.getAdultPerRoom(), adult);
	dropAndDownSelectByValue(search.getChildPerRoom(), child);
}

@When("User click search button")
public void user_click_search_button() {
	toClick(search.getSearch());
}

@Then("user should get error message from checkout date field")
public void user_should_get_error_message_from_checkout_date_field() {
    WebElement dateError = search.getDateError(); 
    System.out.println(dateError.getText());
    Assert.assertEquals("Check-Out Date shall be after than Check-In Date", dateError.getText());
    System.out.println("Feature 2 : Given test case passed ");
}



}
