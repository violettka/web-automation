@dom
Feature: Challenging Dom Page

  Background:
    Given I am on the Challenging Dom page

  Scenario: Ensure that blue button text had changed
    When I click on the blue button
    Then I see that blue button text had changed
