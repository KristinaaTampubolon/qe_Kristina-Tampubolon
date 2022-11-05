Feature: Create order Feature

  @positive
  Scenario Outline: Create order Feature with valid data
    Given I set endpoint create order
    When I set body parameter product_id and quantity
    Then verify response valid create order

  @negative
  Scenario Outline: Create order Feature with empty data
    Given I set endpoint create order empty data
    When I set body parameter product_id and quantity
    Then verify response invalid create order

  @negative
  Scenario Outline: Create order Feature with empty id
    Given I set endpoint create order empty id
    When I set body parameter product_id and quantity
    Then verify response invalid create order
