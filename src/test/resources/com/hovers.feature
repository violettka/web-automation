Feature: Hovers Page
  In order to see the usernames
  I hover over the avatar pictures

Background:
    Given I am on the Hovers page

  Scenario Outline: Hover avatars
    When I hover avatar <index>
    Then I observe the <username_type> username

  Examples:

    | index  | username_type|
    | 1      | user1        |
    | 2      | user2        |
    | 3      | user3        |
