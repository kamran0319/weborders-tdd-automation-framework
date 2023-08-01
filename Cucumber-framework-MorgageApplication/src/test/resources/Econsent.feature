Feature: Econsent

  Scenario: Fill Econsent page
    Given Click on first name
    When Click Agree buttom
    Then I should be able to see Edit buttom is Displayed

  Scenario: Fill Invalid email
    Given Click on email and enter invalid email
    When Click Agree buttom
    Then I should not be able to see Order Credit text