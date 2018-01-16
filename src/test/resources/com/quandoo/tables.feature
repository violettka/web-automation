Feature: Tables Page
  In order to check ordering of the table Example 2
  I order it by the Last Name

Background:
    Given I am on the Tables page

  Scenario: Order by Last Name
    When I order by Last Name
    Then I see descending order of the entries
    And entries are ordered alphabetically

#    When I order by Last Name
#    Then I see ascending order of the entries
#    And entries are ordered alphabetically