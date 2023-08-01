@EX
Feature: Expenses

  Scenario: Fill Expenses page
    Given Add monthly rental
    When Click Next
    Then I should be able to see Borrower Employment Information

