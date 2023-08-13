@UI
Feature: Employment And Income

  Scenario: Fill Employment And Income page
    Given I am on the Mortgage Application
    Then Click on Realtor Information
    And Fill Personal Information
    When Click Next
    Given Click EMPLOYER NAME and fill all section
    When Click Next EaI
    Then I should be able to see PreApproval Inquiry