Feature: Login Page
  In order to access to Secure Area
  As an existing user
  I want to login

  Given Login page

  Scenario: Positive login

    When I login with existing credentials
    Then I observe the successful login message

  Scenario Outline: Negative login

    When I login with <use_case> credentials
    Then I observe the <use_case> message

  Examples:

    | use_case |
    | wrong username |
    | wrong password |
