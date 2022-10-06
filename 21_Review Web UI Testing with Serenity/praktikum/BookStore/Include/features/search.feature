Feature: Search feature

  Scenario Outline: Search book from list by Title
    Given User navigates to landingpage
    When User enters <title>
    Then System displaying a book with appropriate title

    Examples: 
      | title               |
      | Git Pocket Guide    |
      | Speaking JavaScript |
