@SignUp @Regression
Feature: Sign Up
  As a potential client I want to register to interact with the mobile application

  @Smoke
  Scenario Outline: Registers a new user successfull
    Given The app is loaded correctly
    When The user goes to the Sign Up page
    And The user registers a new user with: <username>, <email>, <password>
    Then Home page is displayed

    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |
      | automation | automation@gmail.com | 456789   |

