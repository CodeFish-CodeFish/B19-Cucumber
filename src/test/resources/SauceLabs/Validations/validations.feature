@smoke
Feature: Login functionality

  #Login Scenario
  Background: Login steps
    Given user is navigated to login page
    When user is on login page user enters username and password
    And user clicks on login button

    #Scenario 1

  Scenario: Positive scenario for url title and header
    Given user is main page user validates title
    Then user validates url
    And user validate main header

    #Scenario 2

  Scenario: Positive scenario validating header on the left and dropown
    When user is on main page user validates header on the left nav bar
    Then user validates all the list of options from the dropdown
    And user selects price low to high option



