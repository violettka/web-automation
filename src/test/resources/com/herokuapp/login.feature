@regression
Feature: Login Page

  @positive_login
  Scenario: Positive Login
    Given I am on the Login page
    When I enter user credentials:
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    And I click on the Login button
    Then I see text Secure Area
