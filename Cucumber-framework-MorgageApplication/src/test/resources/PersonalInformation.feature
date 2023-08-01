
@PI
Feature: Personal Information


  Scenario: Fill  Preapproval Details
    Given I am on the Mortgage Application
    Then Fill Preapproval Details
    And Fill Personal Information
    Then I should be able to see Current Monthly Housing Expenses

    

