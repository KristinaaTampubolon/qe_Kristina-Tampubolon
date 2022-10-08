Feature: Search Menu

  Scenario Outline: Search active menu
    Scenario Outline: Test login with valid credentials

    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button
    Then User is navigated to homepage
    When User enters <menu>
    Then User should find menu in the search table

    Examples: 
      | username | password | menu  |
      | Admin    | admin123 | Leave |
