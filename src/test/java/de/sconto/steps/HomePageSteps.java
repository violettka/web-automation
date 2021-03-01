package de.sconto.steps;

import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static de.sconto.pages.HomePage.basicURL;

/**
 * HomePageSteps
 * Class implements the common step definitions for several feature files.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HomePageSteps implements En {
    HomePage homePage;
    LoginPage loginPage;

    public HomePageSteps() {

        Given("I am on the Homepage", () -> {
            homePage = open(basicURL, HomePage.class);
            homePage.acceptCookies();
        });

        Then("I should see Homepage", () -> {
            homePage.carousel().should(exist);
        });
    }
}
