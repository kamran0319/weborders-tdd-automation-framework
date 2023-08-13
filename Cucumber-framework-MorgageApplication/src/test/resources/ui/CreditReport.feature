@UI
Feature: Credit Report

  Scenario: Fill Credit Report page
    Given I am on the Mortgage Application
    Then Click on Realtor Information
    And Fill Personal Information
    When Click Next
    Given Click EMPLOYER NAME and fill all section
    When Click Next EaI

    When Click NO order credit report
    And Click Next buttom
    Then I should be able to see eConsent text