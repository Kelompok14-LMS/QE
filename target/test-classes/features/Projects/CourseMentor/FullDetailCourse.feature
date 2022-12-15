@FullDetailCourse
Feature: Full Detail Course
  as a user
  i want to see detail
  so i can see detail my course

  Scenario: Full detail course with valid url valid token and valid course id
    Given i set url token course id
    When i request full detail course
    And i get status code 200 ok
    Then i get message success get full detail

  Scenario: Full detail course with valid url valid token and invalid course id
    Given i set invalid url course id
    When i request full detail course invalid id
    And i get status code 404
    Then i get message course not found