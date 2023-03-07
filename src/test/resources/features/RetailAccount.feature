Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'phantom.capstone@tekschool.us' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

  @test1
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Khalil1' and Phone '6097358507'
    And User click on Update button
    Then user profile information should be updated
