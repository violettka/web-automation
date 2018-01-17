package com.quandoo.steps;

import com.quandoo.pages.HoversPage;
import cucumber.api.java8.En;

import static com.codeborne.selenide.Selenide.$;
import static com.quandoo.pages.HoversPage.checkUsername;
import static com.quandoo.pages.HoversPage.generateXpath;

/**
 * HoverSteps
 * Class implements the step definitions for testing the Hovers page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HoverSteps implements En {
    public HoverSteps() {

        When("I hover avatar (.*)", (String index) -> {
            $(generateXpath(index)).hover();
        });

        Then("I observe the (.*) username", (String username) -> {
            checkUsername(username);
        });
    }
}
