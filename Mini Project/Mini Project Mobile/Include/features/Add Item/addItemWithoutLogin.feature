@additem
Feature: Add Item
  I want to add item to card

  @additem @positive
  Scenario Outline: Test Item To The Cart without
    Given User selects the item he wants to buy
    When User click BELI button
    Then I verify the item enter to card

