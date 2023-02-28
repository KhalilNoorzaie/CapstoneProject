Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @smokeTest @Regression @FunctionalTestCases
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'phantom.test@gmail.com' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account
    And User click on Logout option

  @dryRun @smokeTest @Regression @registerAccount
  Scenario: Verify user can creat an account into Retail Website
    And User click on Creat New Account button
    And User fill the signUp information with below data
      | name    | email                         | password  | confirmPassword |
      | phantom | phantom.capstone@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
