package com.herokuapp.steps;

import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;
import static com.herokuapp.pages.BasePage.basicURL;

/**
 * CommonSteps
 * Class implements the common step definitions for several feature files.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class CommonSteps {

    @Given("^I am on the (Hovers|Login) page$")
    public void goToPage(String page) {
        if (page.equals("Hovers")) {
            open(basicURL + "/hovers");
        }
        if (page.equals("Login")) {
            open(basicURL + "/login");
        }
    }
}
