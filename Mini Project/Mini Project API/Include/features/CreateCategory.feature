Feature: Create category feature

  @positive
  Scenario Outline: Create category with valid data
    Given I set endpoint Create category
    When I set body parameter name and description
    Then response valid data Create category


  @positive
  Scenario Outline: Create category with empty description
    Given I set endpoint Create category empty description
    When I set body parameter name and description
    Then response valid data Create category

  @negative
  Scenario Outline: Create category with empty name
    Given I set endpoint Create category empty name
    When I set body parameter name and description
    Then response invalid data Create category


