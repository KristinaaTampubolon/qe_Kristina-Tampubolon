Feature: Register feature

  @positive
  Scenario Outline: Register with valid data
    Given I set endpoint register
    When I set body parameter fullname email and password
    Then response valid data register

  @negative
  Scenario Outline: Register with invalid data
    Given I set endpoint register empty data
    When I set body parameter fullname email and password
    Then response invalid data register

  @negative
  Scenario Outline: Register with invalid data
    Given I set endpoint register with registered email
    When I set body parameter fullname email and password
    Then response invalid data register
