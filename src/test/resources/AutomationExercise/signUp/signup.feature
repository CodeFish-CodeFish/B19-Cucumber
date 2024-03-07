Feature: Sign up functionality

  Scenario: Happy path for signing up a user
    Given user is on main page and clicks on signup button
    When user enters username as 'Kuba' and email as 'aksjdhkjsa@jhksjhf.com' and clicks sign up
    Then user checks mr and validates that name is 'Kuba'
    And user verifies that email field is disabled and enters password as '123435345'
    Then user provides day of the month as '12' then months as 'January' and year as 1999
    When user enters firstname as 'Kuba' and lastname as 'Abdy' and adrress as '1 N Dearborn st'
    And user chooses country as 'Singapore' and provides state as 'Illinois' and city as 'Chitown'
    Then user enters zipcode as '60656' and phone number as '31232323123122' and clicks create account button













