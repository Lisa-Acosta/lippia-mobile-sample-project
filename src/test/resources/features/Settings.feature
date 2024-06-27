@Settings @Regression
Feature: Settings
  As an app user I want switch to the dark theme
  Background:
    Given The user is logged in to the clockify app

  Scenario: Switch theme successfull
    When click on the menu
    And select the settings
    And select the app theme
    Then the dark theme is diplayed








