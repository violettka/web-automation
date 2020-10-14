@hovers
Feature: Hovers Page
  In order to see the usernames
  I hover over the avatar pictures

  Background:
    Given I am on the Hovers page

  Scenario Outline: Hover avatars
    When I hover avatar <avatar_index>
    Then I observe the <username> username


    Examples:
      | avatar_index | username|
      | 3            | user3   |
      | 2            | user2   |
