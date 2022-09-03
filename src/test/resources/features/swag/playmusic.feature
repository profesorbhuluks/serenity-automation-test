@ultah
Feature: Play music
  Scenario: Verify user able to play music
    Given User on youtube music page
    When User click quick pick music
    Then User see music played
