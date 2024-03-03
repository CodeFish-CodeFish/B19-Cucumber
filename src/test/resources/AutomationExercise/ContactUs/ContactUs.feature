Feature: Contact Us functionality

  Scenario: Happy Path
    Given User is on main page user clicks on contact us link
    When User is on contact us page user validates url and title of the page
    Then User enters name and email
    And User enters subject of the message and message itself
    Then User attaches file and clicks on submit button

  Scenario: Get texts from contact us page headers
    Given User is on main page user clicks on contact us link
    When User is on contact us page user verifies Contact us text
    Then User validates Get In Touch text
    And user validates Feedback For Us text
