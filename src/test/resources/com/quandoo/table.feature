Feature: Tables Page
To check descending/ascending ordering of the table Example 2
I click on the Last Name column header

Background:
    Given I am on the Tables page

Scenario: Order by Last Name
    When I order by Last Name
    Then I see ascending order of the entries

    When I order by Last Name
    Then I see descending order of the entries