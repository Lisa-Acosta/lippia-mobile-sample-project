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
    And enter the project <project>
    And enter the task <task>
    And enter the tag <tag>
    And choose if it is billablepro <billablepro>
    Then the data entries <project> and <task> is diplayed

    Examples:
      | time | working | project              | task   | tag      | billablepro |
      | 7:15 | TP8     | Api Low Code Project | mobile | clockify | false       |






