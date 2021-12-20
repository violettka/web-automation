package de.sconto.steps;

import com.codeborne.selenide.Configuration;
import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static de.sconto.pages.HomePage.basicURL;

/**
 * HomePageSteps
 * Class implements the Homepage step definitions.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HomePageSteps {
    HomePage homePage;

    @Before
    public void setUp(){
        Configuration.remote = "http://localhost:4445/wd/hub";
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities.setCapability("enableVideo", true);
        Configuration.browser = "firefox";
        Configuration.browserVersion = "95.0";

    }

    @Given("I am on the Homepage")
    public void iAmOnHomePage() {
        homePage = open(basicURL, HomePage.class);
        homePage.acceptCookies();
    }

    @Then("I should see Homepage")
    public void iShouldSeeHomepage() {
        homePage.carousel().should(exist);
    }
}
