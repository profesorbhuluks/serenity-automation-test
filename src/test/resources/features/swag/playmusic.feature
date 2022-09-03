@ultah
Feature: Upgarde music subscription
  Scenario: Verify user able to pay youtube music with gopay
    Given User on youtube music library page
    When User click new playlist
    And User input title "Musik Kerja"
    And User input description "Untuk Kerja"
    Then User see created library
