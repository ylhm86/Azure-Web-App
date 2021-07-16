@smoke_test
Feature: Smoke test


  Scenario: Login as different users
    Given user logs in with following credentials
      | username | admin@visitingmedia.com |
      | password | testthistruetour2020     |
    Then user navigates to "Properties"
    And user verifies that "All properties" page name is displayed

  @XD-113
  Scenario: Login as a salesperson
    Given user logs in as a salesperson
    And user verifies that "True Tour App" page name is displayed