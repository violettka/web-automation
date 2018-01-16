package com.quandoo.steps;

import cucumber.api.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.quandoo.TestStepsBase.basicURL;

/**
 * CommonSteps
 * Class implements the common step definitions for several feature files.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class CommonSteps implements En {

    public CommonSteps() {

        Given("I am on the (.*) page", (String page) -> {
            if (page.equals("Login")) {
                open(basicURL + "/login");
            }
            if (page.equals("Hovers")) {
                open(basicURL + "/hovers");
            }
            if (page.equals("Tables")) {
                open(basicURL + "/tables");
            }
        });
    }
}
