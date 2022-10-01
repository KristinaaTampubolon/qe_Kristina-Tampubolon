Feature: Login

  Scenario: Successful Login with Valid Credential
    Given open chrome and start application
    When I enter my username and password correctly
    Then I am on the home page 