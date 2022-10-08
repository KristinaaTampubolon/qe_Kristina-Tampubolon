Feature: Add Employee

  Scenario Outline: Add Employee with new data
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button
    Then User is navigated to homepage
    When User click on  add button
    Then User can view add employee page
    When User enters <firstname> and <lastname>
    And Click save button
    Then verify add sucessfully

    Examples: 
      | username | password | firstname | lastname |
      | Admin    | admin123 | Kristina  | test     |
