@UI
Feature: Expenses

  Scenario: Fill Expenses page
    Given I am on the Mortgage Application
    Then Click on Realtor Information
    And Fill Personal Information
    When Click Next EaI

    When Click Next
    Then I should be able to see Borrower Employment Information

