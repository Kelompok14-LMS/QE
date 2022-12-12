@Register
Feature: Register
  As a user
  I want to regis
  So i can regis new account

  Scenario: Regis with valid url and valid body
    Given I set url regis
    When I input valid body
    And I get status code 200
    Then I get message succes send otp to email

  Scenario: Regis with valid url and null body
    Given I set url regis
    When I input null body
    And I get status code 400
    Then I get message data null

  Scenario: Regis with valid url body valid email and null password
    Given I set url regis
    When I input valid email and null body
    And I get status code 400
    Then I get message data null

  Scenario: Regis with valid url body null email and valid password
    Given I set url regis
    When I input null email and valid password
    And I get status code 400
    Then I get message data null

  Scenario: Regis with body already exist
    Given I set url regis
    When I input body already email already password
    And I get status code 409
    Then I get message email already exist