Feature: Pay Order

  Scenario Outline: User want to pay order
     Given user navigated to login page
    When user fill <email> and <password>
    And user click login button
    When user go to chart
    And user click pay order button
    Then user can see the transaction order

      Examples: 
      | email 							| password |
      | tina@gmail.com  | password |