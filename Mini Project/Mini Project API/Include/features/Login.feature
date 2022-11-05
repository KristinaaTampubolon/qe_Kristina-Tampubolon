Feature: Login Feature

  @positive
  Scenario Outline: Login with valid data
    Given Post call to url login
    Then response url user login valid is 200

  @negative
  Scenario Outline: Login with invalid data
    Given Post call to url login with empty data
    Then response url user login invalid is 400

  @negative
  Scenario Outline: Login with invalid data
    Given Post call to url login with empty email
    Then response url user login valid is 400

  @negative
  Scenario Outline: Login with invalid data
    Given Post call to url login with empty password
    Then response url user login valid is 400

  @negative
  Scenario Outline: Login with invalid data
    Given Post call to url login with unregistered email
    Then response url user login valid is 400
