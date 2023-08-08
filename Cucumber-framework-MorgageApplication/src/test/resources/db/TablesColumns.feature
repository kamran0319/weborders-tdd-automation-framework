
@DB
Feature: Verify business rules

  Scenario: verify column names for tbl_user table
    When I retrieve the column names from the "tbl_user" table
    Then it should have the following list
      | id          |
      | email       |
      | password    |
      | first_name  |
      | last_name   |
      | phone       |
      | image       |
      | type        |
      | created_at  |
      | modified_at |
      | zone_id     |
      | church_id   |
      | country_id  |
      | active      |



