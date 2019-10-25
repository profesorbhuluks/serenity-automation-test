@Swag
Feature: Login user

  Scenario: Login to swag app
    Given user on login page
    When user type "standard_user" on username filed
    And user type "secret_sauce" on password field
    And user click login button
    Then User should on Products page
    When user on product page add one item to shopping cart
    And User should see badges on cart
    And user should see remove button on selected item
    And User click cart icon
    Then User should on cart page
    When user click checkout button
    Then user should see your information page
    And user should fill first name by "John"
    And user should fill last name by "Doe"
    And user should fill zip code by "42121"
    And user should click continue button
    And click finish button
    And should see ponny express