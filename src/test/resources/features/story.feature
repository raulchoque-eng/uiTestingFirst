Feature: Story manages.
  A story (called a “user story” by some practitioners) in Tracker is a short description
  of functionality or an incremental piece of capability that is of value to the customer
  or delivery team.

  @Project
  Scenario: I should be able to create a Story
    Given   I log in with username "yfert_0209@hotmail.com" and password "r6412018C"
    When    I navigate to a Project in Dashboard page
    And     I navigate to Story in Project page
    And     I create a new Story in Current Operation and Backlog panel with name "New Story test"
#      | Story Name     | Test Story |
#      | Account          | Untitled     |
#      | Project privacy  | Private      |
#    Then the Project page should be displayed
#    When I navigate to Project Dashboard page
#    Then the Project name should be displayed in Project Dashboard page
#    When I navigate to Projects page
#    Then the Project name should be displayed in Projects page
#    When I display the Projects menu from the top bar
#    Then the Project name should be displayed in the Projects menu