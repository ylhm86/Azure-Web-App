
  Feature: Login
  As user I want to login under different roles
# So hook will take care of this action
#  Hook will open main page
#  Background:
#    Given user is on the landing page


  @adminuser
  Scenario: Login as an admin user
    Then user logs in as an admin manager
   # And user verifies that "True Tour App" page name is displayed

#  @negative
#  Scenario: Verify warning message for invalid credentials
#    Then user logs in with "wrong" username and "wrong" password
#    And user verifies that "Invalid user name" warning message is displayed
#
#  @salesperson
#  Scenario: Login as a salesperson
#    Then user logs in as a salesperson
#    And user verifies that "True Tour App" page name is displayed

#  @map_example
#  Scenario: Login as different users
#    Given user logs in with following credentials
#      | username | admin@visitingmedia.com |
#      | password | testthistruetour2020     |
#    Then user navigates to "Properties"
#    And user verifies that "All properties" page name is displayed