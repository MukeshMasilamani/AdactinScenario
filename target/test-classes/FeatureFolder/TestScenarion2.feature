@Datecheck
Feature: To Validate the date funtionality in Search hotel page

  Background: 
    Given User navigate to login page and enter valid username and password and navigate to Search hotel page
      | username | MukeshMasailamani |
      | password | Since@1995        |

  Scenario: 
    When User enter location, hotels , room type and no of rooms.
    And User enter the check-out date field before date than check-in date.
    And User enter adults per room and children per room details
    And User click search button
    Then user should get error message from checkout date field
