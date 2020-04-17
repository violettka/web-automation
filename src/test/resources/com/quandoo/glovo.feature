Feature: Glovo Contact Form

  @glovo
  Scenario:
    Given I am on the Glovo page
    When I fill in the Contact Form:
      | name   | email  | phone  | businessName | businessType | city    | postal |
      | random | random | random | random       | Restaurant   | Rabieta | 10367  |

