@UI
Feature: Econsent

  Scenario: Fill Econsent page
    Given I am on the Mortgage Application
    Then Click on Realtor Information
    And Fill Personal Information
    When Click Next
    Given Click EMPLOYER NAME and fill all section
    When Click Next EaI

    Given Click on first name
    When Click Agree buttom
    Then I should be able to see Edit buttom is Displayed
#
  Scenario: Fill Invalid email
    Given I am on the Mortgage Application
    Then Click on Realtor Information
    And Fill Personal Information
    When Click Next
    Given Click EMPLOYER NAME and fill all section
    When Click Next EaI

    Given Click on email and enter invalid email
    When Click Agree buttom
    Then I should not be able to see Order Credit text

