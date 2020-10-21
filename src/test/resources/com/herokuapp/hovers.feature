 @regression
Feature: Hovers Page
  In order to see the usernames
  I hover over the avatar pictures

Background:
    Given I am on the Hovers page

  @hovers
  Scenario: Hover avatars
    When I hover avatar 3
    Then I observe the user3 username

    When I click on text View profile
    Then I observe Not Found text


