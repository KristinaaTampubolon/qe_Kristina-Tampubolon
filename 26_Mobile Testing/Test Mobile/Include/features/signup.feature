Feature: sign up feature

  Scenario Outline: Test sign up successfully
    Given user navigate to landingpage
    When user click icon login
    And click signup tab
    And input <Email> <Password> and <Confirm_Password>
    Then click signup button

    Examples: 
      | Email          | Password                 | Confirm_Password         |
      | Tina@gmail.com | rsgGh7fdu5Lmy4zSHHzemA== | rsgGh7fdu5Lmy4zSHHzemA== |
