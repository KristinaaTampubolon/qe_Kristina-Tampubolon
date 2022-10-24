Feature: Login feature

  Scenario Outline: Test Login successfully
    Given user navigate to homepage
    When User click login button
    And user enters <email> and <password>
    And Test login
    Then sucessfully login

    Examples: 
      | email              | password                 |
      | kristina@gmail.com | 8SQVv/p9jVScEs4/2CZsLw== |
