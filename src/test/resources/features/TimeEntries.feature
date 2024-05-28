@TimeEntries @Regression
Feature: Time Entries
  As an app user I want to enter data so that it can be saved
  Background:
    Given The user is logged in to the clockify app
    And clicks on the time entries button
  @Smoke
  Scenario Outline: Time Entries successfull
    When enter duration time <time>
    And choose the working <working> on
    And enter de project <project>
    And choose if it is billablepro <billablepro>
    Then the data entries <project> is diplayed

    Examples:
      | time | working | project              | billablepro |
      | 7:15 | TP8     | Api Low Code Project | false       |






