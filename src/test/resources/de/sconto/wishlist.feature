Feature: Sconto Wishlist Feature
  In order to see the my wishlist
  I add items to it

  Scenario: Adding to Wishlist
    Given I am on the Homepage
    When I click on Sofas
    Then I see Sofas Category Page

    When I click on Heart element
    Then I see pop-up window

    When I click on Login pop-up button
    Then I see Login page

    When I insert valid user credentials
    And I click on Login button
    Then I should see Wishlist
    And I should see added element