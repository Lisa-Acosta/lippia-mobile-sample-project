@Logout @Regression
Feature: Log out
  As an app user I want log out of app
  Background:
    Given The user is logged in to the clockify app

  @Smoke
  Scenario: Log out successfull
    When click on the menu
    And select the Log out
    Then the login is diplayed








