@LogOut @Regression
Feature: Log out
  As a potential client i want log out of the mobile application

  @Smoke
  Scenario: The user log out sucessfull
    Given The app is loaded correctly
    And The user logs in the application with user and password
    And The user log out of the app
    Then Login page is displayed




