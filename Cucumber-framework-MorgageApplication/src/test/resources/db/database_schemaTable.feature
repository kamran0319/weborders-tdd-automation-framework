Feature: The database schema
  @DB
  Scenario: verify column names for tbl_mortagage table
    When I retrieve the columns names from the "tbl_mortagage" table
    Then The database schema should have following list
      | rent_own_status               |
      | monthly_rental_payment        |
      | first_mortagage_total_payment |

  @DB
  Scenario: verify  "rent_own_status" field should only allow two values, "Rent" and "Own"
    When I retrieve the field values from the "rent_own_status" field
    Then The database schema should have following two values
      | Rent  |
      | Own   |


  @DB
  Scenario: verify  The "first_mortgage_total_payment" fields should only allow positive numeric values
    When I fill the "first_mortagage_total_payment" with "-80000" value field on idNum 714
    Then The database schema should not show negative values

  @DB
  Scenario: verify  The "monthly_rental_payment" fields should only allow positive numeric values
    When I fill the "monthly_rental_payment" with "-6000" value field on idNum 714
    Then The database schema should not show negative values



