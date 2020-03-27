Feature: Hovers Page
  In order to see the usernames
  I hover over the avatar pictures

Background:
    Given I am on the Hovers page

  Scenario: Hover avatars
    When I hover avatar 1
    Then I observe the user1 username