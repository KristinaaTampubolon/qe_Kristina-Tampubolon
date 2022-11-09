Feature: View Transaction History Order

  Scenario Outline: User want to View Transaction History Order
    Given user navigated to login page
    When user fill <email> and <password>
    And user click login button
    When user click profile icon
    And user click transaction button
    Then user can see the transaction order

    Examples: 
      | email          | password |
      | tina@gmail.com | password |
