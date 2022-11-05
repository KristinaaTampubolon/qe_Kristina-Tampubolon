Feature: Login feature

  @positive
  Scenario Outline: Get User info
    Given Get call to url user info
    Then response url user info is 200

  @negative
  Scenario Outline: Get User Info with Post
    Given Post call to url get user info
    Then response url post userinfo is 405

  @negative
  Scenario Outline: Get User info with Put
    Given Put call to url get user info
    Then response url put info is 405

  @negative
  Scenario Outline: Get User info with Delete
    Given Delete call to url get user info
    Then response url Delete user info is 405

