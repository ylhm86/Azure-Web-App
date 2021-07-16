@experiences
Feature: Experiences
  As user I want to see list of all experiences

  Scenario: Login as admin user and navigate to the Experiences
    Given user is on the landing page
    When user logs in as a "admin user"
    Then user navigates to "Experiences"
    And user verifies that "Experiences" page name is displayed
    And user verifies that default page number is 1