Feature: Glovo Business

  @glovo
  Scenario: Business Signup
    Given I am on the Signup page
    When I fill in the Signup form:
      | name | email | password |
    And I click Signup button
    Then I see Privacy view

    When I accept Terms and Conditions
    Then I see Login Verification view

    When I click Skip button
    Then I see Order list
    And I see user name