@Login
Feature: Login
  as a user
  i want to login
  so i can manage my dahsboar

  Scenario: Login with valid url and valid body
    Given i set url login
    When i input valid body
    And i get status code 200
    Then i get message login success