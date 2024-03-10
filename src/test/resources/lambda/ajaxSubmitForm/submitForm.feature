Feature: check new input fields

  Scenario: happy path
    Given user is on main page of lambda user clicks on ajax submit form
    Then user enters name and message as follows
      | name    | Kobe        |
      | message | hello world |
    And user clicks on submit button
    Then user validates ajax message as follows
      | expectedMessage | Ajax Request is Processing! |