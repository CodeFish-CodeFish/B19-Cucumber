Feature: WebOrder functionality input fields
#  Scenario: AC check all input fields on web order page happy path
#    Given user is on main page of login page and validates title as 'Web Orders Login'
#    Then user enters their username as 'Tester' and password as 'test'
#    And user clicks on login btn
#    When user is on main page user clicks on order tab
#    Then user on order page selects 'ScreenSaver' and enters quantity as '200'
#    And user enters price as '500' discount as '50' and total as '34'
#
#    #Address  Information
#    Then user enters their name as 'Kobe Bryant' and street address as 'Venice Ave'
#    When user enters city as 'Los Angeles' and state as 'California' and zipcode as '60656'
#    Then user selects visa and provides cc as '123456789' and expiration date as '12/24'
#    And user finally clicks on process button

  Scenario Outline: check all input fields
    Given user is on main page of login page and validates title as 'Web Orders Login'
    Then user enters their username as 'Tester' and password as 'test'
    And user clicks on login btn
    When user is on main page user clicks on order tab

    Then user on order page selects '<productName>' and enters quantity as '<quantity>'
    And user enters price as '<price>' discount as '<discount>' and total as '<total>'


    Then user enters their name as '<name>' and street address as '<address>'
    When user enters city as '<city>' and state as '<state>' and zipcode as '<zipCode>'
    Then user selects visa and provides cc as '<cc>' and expiration date as '<exp>'
    And user finally clicks on process button
    Examples: test data
      | productName | quantity     | price | discount | total  | name          | address       | city        | state      | zipCode | cc          | exp   |
      | ScreenSaver | 500          | 400   | 300      | 1500   | Kobe Bryant   | Venice Ave    | Los Angeles | California | 60656   | 12324325345 | 12/25 |
      | ScreenSaver | @#@%$$%      |       | skjdhf   | 000    | Thomas Shelby | Venice Ave    | Birmingham  | California | 60656   | 12324325345 | 12/25 |
      | ScreenSaver | hsgdchfdsjhg | @#$#$ | @#$#%    | uiuiui | John Snow     | Mountain View | Los Angeles | California | 60656   | 12324325345 | 12/25 |



























