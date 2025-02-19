Feature: Login Functionality Check
  Scenario: User login in with valid credentials
    Given User is on the login page
    When User enters valid credentials
    Then User should be logged in successfully