Feature: Search

  @search
  Scenario Outline: Search Tests
    Given I open Search page
    When I search for the <color> color
    Then I see the filter <color> is applied
    Examples:
      | color |
    |  weiß      |
