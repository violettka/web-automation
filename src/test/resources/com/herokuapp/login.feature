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

  @negative_login
  Scenario Outline: Negative Login
    Given I am on the Login page
    When I enter user credentials:
      | username   | password   |
      | <username> | <password> |
    And I click on the Login button
    Then I see validation message


    Examples:
      | username | password             |
      | tomsmith | blah                 |
      |          | blah                 |
      |          | SuperSecretPassword! |