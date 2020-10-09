Feature: Login Page

  @login
  Scenario: Login tests
    Given I am on the Login page
    When I enter credentials:
    |username|password|
    |tomsmith|SuperSecretPassword!|
  Then I see message:
  """
  You logged in!
  """

#    Examples:
#      |  |