

Feature: The database should have "tbl_users" table which should contain the
           following columns:
  @DB
Scenario: Sign up with valid user details and verify user info - READ
Given I fill up the fields with the following info and click sign up
  | username | lastname  | email            | password  |
  | sierra   | macdowell | sierra@gmail.com | Sierra123 |
  Then I should be able to sign up
Then the created user info in the database should be the following
  | username | lastname  | email            | password  |
  | sierra   | macdowell | sierra@gmail.com | Sierra123 |

