@moemax
Feature: Moemax Filter Marke

  Scenario Outline: Choise Marke
    Given I am on the Moemax page
    When I choise Marke
    And I choise <marke> Marke
    Then I see only selected Marke

    Examples:
      | marke |
      | AEG |
      | Amika |