package de.sconto.steps;

import com.codeborne.selenide.Condition;
import de.sconto.pages.CategoryPage;
import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

/**
 * LoginSteps
 * Class implements the Login page step definitions.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class LoginSteps implements En {

    LoginPage loginPage;
    HomePage homePage;
    CategoryPage categoryPage;

    public LoginSteps() {

        When("I click on the Login icon", () -> {
            homePage = page(HomePage.class);
            loginPage = homePage.clickLoginIcon();
        });

        Then("I see Login page", () -> {
           loginPage.loginPageHeader().should(Condition.exist);
           loginPage.loginPageHeader().shouldHave(text("Anmelden"));
        });

        When("I insert valid user credentials", () -> {
            loginPage.validLoginInput();
        });

        When("I click on Login button", () -> {
            loginPage.clickLoginBtn();
        });

        When("I click on Login pop-up button", () -> {
            categoryPage = page(CategoryPage.class);
            loginPage = categoryPage.clickOnAnmeldenBtn();
        });
    }
}
