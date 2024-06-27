@TimeEntries @Regression
Feature: Time Entries
  As an app user I want to enter data so that it can be saved

  Background:
    Given The user is logged in to the clockify app
    And clicks on the time entries button

  @Smoke @DeleteTimeEntrie
  Scenario Outline: Time Entries: hours only successfull
    When enter duration time <time>
    And choose the working <working> on
    And enter the project <project>
    And enter the task <task>
    And enter the tag <tag>
    And choose if it is billablepro <billablepro>
    Then the data entries <project> and <task> is diplayed

    Examples:
      | time | working  | project        | task      | tag      | billablepro |
      | 7:15 | TP Final | Mobile Project | mobile TP | clockify | false       |

  @Smoke @DeleteTimeEntrie
  Scenario Outline: Time Entries: hours and date successfull
    When enter duration time <time>
    And enter date <date>
    And choose the working <working> on
    And enter the project <project>
    And enter the task <task>
    And enter the tag <tag>
    And choose if it is billablepro <billablepro>
    Then the data entries <project> and <task> is diplayed

    Examples:
      | time | date       | working  | project        | task       | tag      | billablepro |
      | 7:15 | 13-06-2024 | TP Final | Mobile Project | mobile TP1 | clockify | false       |

  @Cancel
  Scenario Outline: Time Entries: cancel successfull
    When enter duration time <time>
    And enter date <date>
    And choose the working <working> on
    And enter the project <project>
    And enter the task <task>
    And enter the tag <tag>
    And enter if it is billablepro <billablepro> and cancel
    Then the data entries <project> is not diplayed

    Examples:
      | time | date       | working  | project        | task       | tag      | billablepro |
      | 7:15 | 13-06-2024 | TP Final | Mobile Project | mobile TP2 | clockify | false       |
