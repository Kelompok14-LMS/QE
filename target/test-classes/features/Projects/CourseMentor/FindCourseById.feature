@FindCourseById
Feature: Find Course By Id
  as a user
  i want find course
  so i can fin my course by id

  Scenario: Find course by id with valid url and valid method
    Given i set url find course by id
    When i request find course by id
    Then i get message Success get course by id

  Scenario: Find course by id with valid url and invalid method
    Given i set url find course by id
    When i request find course by id with invalid method
    Then i get message method not allowedd