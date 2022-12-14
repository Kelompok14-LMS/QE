@Verify
Feature: Verify Register Mentee
  as a user
  i want to verify
  so i can verify

  Scenario: Verify with valid url and valid otp
    Given i set url verify
    When i input valid otp
    And i get status code 201
    Then i get message register success

  Scenario: Verify with valid url and wrong otp
    Given i set url verify
    When i input wrong otp
    And i get status code 409
    Then i get message otp not found

