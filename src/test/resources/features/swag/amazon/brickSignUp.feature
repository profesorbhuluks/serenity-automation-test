@brickSignup
Feature: Sign up brick

  Background: Given user on sign up page

  Scenario: Verify user can successfully sign up until verify if the email doesn't exist
    When user input first name "Brick"
    And user input last name "Qa"
    And user input email "brickqa@mailinator.com"
    And user input phone number "085891955026"
    And user input address "Alamat Lengkap"
    And user input password "password"
    And user input confirm password "password"
    And user click registration button
    Then user successfully register

  Scenario: Verify user see the error message when input password less than 6 character
    When user input password "passw"
    Then user see the error message "Please enter at least 6 characters."

  Scenario: Verify user see the error message when input confirm password not match with the password
    When user input password "password"
    And user input confirm password "pass"
    Then user see the error message "Password need to match"

  Scenario: verify user will direct to Login page when user click Login on sign up page
    When user click login link on sign up page
    Then user successfully direct to Login page





