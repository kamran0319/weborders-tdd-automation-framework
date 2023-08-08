

Feature: Verify basic CRUD operations  UI and DB flow

@create
  Scenario: Sign up with valid user details and verify user creation  - Create
    Given  the user is on the sign-up page
    When the user enters valid info
    Then the system should create a new user in the "users" table of the database


  Scenario:  Sign up with valid user details and verify user info - Read
    Given the user is on the sign-up page
    When the user enters valid ingo
    Then the created user ingo in the database should match


    Scenario: Update user email and verify the update - Update
      Given the user is on the login page
      When the user enters valid username as "duotech2023" and password as "duotech"
      Then the user is redirected to the home page
      And the user updates the email field to a new value "helloworld2050@gmail.com"
      Then the success message shoul be displayed on the UI
      And  the user email with username "duotech2023" is also update in the database


      Scenario: Create and Delete Playlist - Delete
        Given the user is on the login page
        When the user enters valid username as "duotech2023" and password as "doutech"
        Then the user is redirected to the home page
