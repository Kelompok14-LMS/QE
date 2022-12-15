@FindCourseByMentor
Feature: Find Course By Mentor
  as a user
  i want to see detail
  so i can see detail my course

  Scenario: Find course by mentor with valid url and valid mentor id
    Given i set url find by mentor
    When i request find by mentor
    And i get status code 200 ok
    Then i get message Success get courses by mentor

  Scenario: Find course by mentor with invalid url and invalid mentor id
    Given i set invalid url find by mentor
    When i request invalid find by mentor
    And i get status code 500
    Then i get message Mentor not found