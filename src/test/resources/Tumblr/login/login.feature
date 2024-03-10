Feature: login functionality

  Scenario Outline: check wrong credential login attempts
    Given user is on main page user clicks on login button
    Then user clicks on continue with email button
    And user enters '<email>' and clicks on next button
    Then user enters '<wrongPassword>' clicks on next button and validates '<errorMessage>'
    Examples: test data
      | email         | wrongPassword | errorMessage                           |
      | test@test.com | sdfjksdh      | Your email or password were incorrect. |
      | test@test.com | 123234        | Your email or password were incorrect. |
      | test@test.com | 432421        | Your email or password were incorrect. |
      | test@test.com | rtyrtyt       | Your email or password were incorrect. |