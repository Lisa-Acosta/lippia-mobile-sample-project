@Login @Regression
Feature: Login
  As a potential client i want to log to interact with the mobile application

  @Smoke
  Scenario: Successfull login
    Given The app is loaded correctly
    When The user logs in the application with user and password
    Then Home page is displayed





