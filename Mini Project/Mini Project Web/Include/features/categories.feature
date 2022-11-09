Feature: Select Category

  Scenario Outline: User want to select gaming category
    Given user navigated to login page
    When user fill <email> and <password>
    And user click login button
    When user select category dropdown
    And user choose gaming category
    Then user successfully get product from gaming category

      Examples: 
      | email 							| password |
      | desianna@gmail.com  | password |