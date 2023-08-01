Feature: login
  As a user, I should be able to login.

@login
  Scenario: Login with valid credentials
    Given I am on the homepage
    When I enter the valid credentials
    Then I should be able to login