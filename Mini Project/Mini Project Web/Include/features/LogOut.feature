@tag
Feature: Log Out

@tag1
  Scenario Outline: User want to log out from AltaShop application
    Given user navigated to login page
    When user fill <email> and <password>
    And user click login button
    When user click profile icon
    And user clicked log out button
    Then user successfully log out from Altashop App

  Examples: 
      | email 							| password |
      | tina@gmail.com  | password |