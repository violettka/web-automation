Feature: Login Page
  In order to login successfully
  User inserts valid credentials

  @login
  Scenario: Positive Login Test
    Given I am on the Login page
    When I enter user credentials:
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    And I click on Login button
    Then I see successful login message