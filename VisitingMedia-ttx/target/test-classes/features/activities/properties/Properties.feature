@properties
Feature: All Properties
  As user I want to be able to see all properties as a table

  Scenario: Verify column names
    Given user logs in as an admin user
    When user navigates to "Visiting Media"
    Then following table headers should be displayed
      | Visiting Media    |
