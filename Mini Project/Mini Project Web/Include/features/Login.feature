Feature: Log In

  @InvalidCredentials
  Scenario Outline: user want to login with Invalid credentials
    Given user navigated to login page
    When user fill <email> and <password>
    And user click login button
    Then system verifying condition <email> and <password>

    Examples: 
      | email          | password  |
      | kaka           | password1 |
      | tina@gmail.com | password2 |
      | try@gmail.com  | password  |

  @ValidCredentials
  Scenario Outline: user want to login with Valid credentials
    Given user navigated to login page
    When user fill <email> and <password>
    And user click login button
    Then system verifying condition <email> and <password>

    Examples: 
      | email          | password |
      | tina@gmail.com | password |
