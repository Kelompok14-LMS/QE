@FindAllCourse
Feature: Find All Course
  as a user
  i want see my course
  so i can see all my course

  Scenario: Find all course with valid url and valid token
    Given i set url find all course
    When i request find all course
    And i get status code 200 ok
    Then i get message succes

  Scenario: Find all course with valid url and invalid method
    Given i set url find all course
    When i request find all course with invalid method
    And i get status code 405
    Then i get message method not allowed