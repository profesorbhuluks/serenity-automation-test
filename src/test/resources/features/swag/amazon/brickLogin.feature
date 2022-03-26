@brickLogin
Feature: Login brick

  Background: Given user on brick login page

  Scenario: Verify user can successfully login with correct email and password
    When user correct email and password
    And user click Login button on brick login page
    Then user successfully login

  Scenario: Verify user cant login to dashboard when account still not verify
    When user input unverified email and password
    Then user see error message "Wrong email or password"
