Feature: Test Orange HRM

  Background: 
    Given user is on loginPage
    Then user Enter Username and Password
      | Admin | admin123 |
    Then User is On Home Page

  Scenario: Test LoginPage functionality
    When user Validate LoginPage

  Scenario Outline: Test PIM Page fuctionality
    Then user click on PIM tab and click on Add button and enter "<firstname>" , "<middleName>", and "<lastName>" and Click on save button
    Then User Add More Personal Details
    Then user go on PIM and search for the newly created user
    Then user Delete the newly created user

    Examples: 
      | firstname | middleName | lastName |
      | Pankaj    | Balshiram  | Pawase   |
      | Ganesh    | Dattatray  | Shete    |
      | Mayur     | Dashrath   | Pawase   |
