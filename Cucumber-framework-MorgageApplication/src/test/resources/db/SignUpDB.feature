
@DB
Feature: The database should be able to handle a large number of user signups



  Scenario Outline: user creation in db and validate on the ui
Given I enter valid credentials on the ui
| username   | lastname   | email   | password   |
| <first> | <last> | <email> | <password> |
Then I should be able to see "Welcome Back" text
And The user is deleted in the database

Examples:
  | first     | last     | email               | password      |
  | Jane      | Eyre     | janeeyre@gmail.com  | Janeeyre123   |
  | Sherlock  | Holmes   | sherlock@gmail.com  | Sherlock123   |
  | Doctor    | Watson   | drwatson1@gmail.com | Drwatson123   |
  | Professor | Moriarty | moriarty@gmail.com  | Moriarty12345 |