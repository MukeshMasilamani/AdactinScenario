Feature: To check login page functionality

  Background: 
    Given User navigate to adaction login page
	@sc1
  Scenario: To Validate login functionality with valid credentials
    When User enter username and password
      | username | MukeshMasailamani |
      | password | Since@1995        |
    And User click login button
    Then User should navigate to seacrh hotel page

  @Loginerror
  Scenario: To Validate login functionality with invalid credentials
    When User enter invalid user name and password
      | username | MukeshMani  |
      | password | Since@98989 |
    And User Click login button
    Then User get error message is displayed in login page

  Scenario: To Validate the new register link to create new account
    When clicking the new user register here link
    Then user should navaigate to new registraion page
