Feature: Fill in input fields

  Scenario: Happy path
    Given user is on main page of lambda user clicks on input form
    Then user enters name email and password as follows
      | name     | Kobe          |
      | email    | test@test.com |
      | password | 123235454     |
    When user enters company website and selects country as follows
      | company | Google         |
      | website | www.google.com |
      | country | United States  |
    Then user provides city address1 and address2
      | city     | London           |
      | address1 | 1 N Dearborn ave |
      | address2 | 2 N Dearborn ave |
    When user enters state and zipcode and clicks on submit button
      | state   | Illinois |
      | zipcode | 60656    |
    Then user validates success message as follows
      | successMessage | Thanks for contacting us, we will get back to you shortly. |
