Feature: check login functionality

  Scenario Outline: check negative scenario for login functionality
    When user is login page user validates title as '<title>'
    Then user enters email as '<email>' and password as '<password>' and validates error msg as '<errorMessage>'
    Examples: test data for login functionality
      | title         | email         | password   | errorMessage                                          |
      | Account Login | email@com.com | 12323324   | Warning: No match for E-Mail Address and/or Password. |
      | Account Login | dot@com.com   | !@#@!#$@#% | Warning: No match for E-Mail Address and/or Password. |
      | Account Login | !@#@#$@com.io |            | Warning: No match for E-Mail Address and/or Password. |
      | Account Login |               | dsfasdfdsa | Warning: No match for E-Mail Address and/or Password. |
      | Account Login |               |            | Warning: No match for E-Mail Address and/or Password. |

