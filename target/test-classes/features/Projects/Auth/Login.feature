@Login
Feature: Login
  as a user
  i want to login
  so i can manage my dahsboard

  Scenario: Login with valid url and valid body
    Given i set url login
    When i input valid body
    And i get status code 200
    Then i get message login success

  Scenario: Login with valid url and null body
    Given i set url login
    When i input null body
    And i get status code 400
    Then i get message status error

  Scenario: Login with valid url and body valid email null password
    Given i set url login
    When i input valid email null password
    And i get status code 400
    Then i get message status error

  Scenario: Login with valid url and body null email valid password
    Given i set url login
    When i input null email valid password
    And i get status code 400
    Then i get message status error

  Scenario: Login with valid url and body valid email wrong password
    Given i set url login
    When i input valid email wrong password
    And i get status code 409
    Then i get message user not found

  Scenario: Login with valid url and body invalid format email
    Given i set url login
    When i input invalid format email
    And i get status code 400
    Then i get message status error

  Scenario: Login with valid url and body wrong email valid password
    Given i set url login
    When i input wrong email valid password
    And i get status code 409
    Then i get message user not found