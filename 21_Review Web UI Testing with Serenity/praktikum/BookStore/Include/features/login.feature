Feature: Login feature

  Scenario Outline: Test Login successfully
    Given User navigates to login page
    When Click login button
    And User enters <userName> and <password>
    And Test Login
    Then User is navigated to homepage

    Examples: 
      | userName | password                 |
      | Kristina | 4OfTV1dkQXKwKrru2z0OGg== |
      | Tina     | 4OfTV1dkQXLPlWHDG64NKg== |
