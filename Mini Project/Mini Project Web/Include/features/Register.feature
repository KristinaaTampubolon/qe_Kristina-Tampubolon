Feature: Register

  @InvalidCredentials
  Scenario Outline: user want to register with Invalid credentials
    Given user navigated to register page
    When user input the value of  <Fullname> then  <email> and <password>
    And user click register button
    Then system verify <Fullname> then  <email> and <password>

    Examples: 
      | Fullname | email          | password |
      | Test     |                |          |
      |          | test@gmail.com |          |
      |          |                | password |
      | Test     | test@gmail.com |          |
      | Test     |                | password |

  @ValidCredentials
  Scenario Outline: user want to register with Valid credentials
    Given user navigated to register page
    When user input the value of  <Fullname> then  <email> and <password>
    And user click register button
    Then system verify <Fullname> then  <email> and <password>

    Examples: 
      | Fullname | email                 | password |
      | Register | iniregister@gmail.com | password |
