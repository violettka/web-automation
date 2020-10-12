package com.herokuapp.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.matchesText;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.HoversPage.checkUsername;
import static com.herokuapp.pages.HoversPage.generateXpath;
import static com.herokuapp.pages.HoversPage.user3;


/**
 * HoverSteps
 * Class implements the step definitions for testing the Hovers page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HoverSteps implements En {
    public HoverSteps() {

        When("I hover avatar 3", () -> {
            $(generateXpath("3")).hover();
        });

        Then("I observe the user3 username", () -> {
            assert ($(user3).getText().contains("user3"));
        });
    }


}
