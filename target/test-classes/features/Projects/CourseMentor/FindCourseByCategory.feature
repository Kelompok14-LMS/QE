@FindCourseByCategory
Feature: Find Course By Category
  as a user
  i want to see detail
  so i can see detail my course

  Scenario: Find course by category with valid url and valid category
    Given i set url find course by category
    When i request find course by category
    And i get status code 200 ok
    Then i get message Success get courses by category

  Scenario: Find course by category with valid url and invalid category
    Given i set invalid url find course by category
    When i request find course by invalid category
    And i get status code 404
    Then i get message Category not found