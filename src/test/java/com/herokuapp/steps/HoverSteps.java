package com.herokuapp.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.matchesText;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.HoversPage.generateXpath;
import static com.herokuapp.pages.HoversPage.user2;
import static com.herokuapp.pages.HoversPage.user3;


/**
 * HoverSteps
 * Class implements the step definitions for testing the Hovers page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HoverSteps implements En {
    public HoverSteps() {

        When("I hover avatar {}", (String index) -> {
            $(generateXpath(index)).hover();
        });

        Then("I observe the {} username", (String username) -> {
            By user = null;
            if (username.equals("user3"))
                user = user3;
            if (username.equals("user2"))
                user = user2;
            assert ($(user).getText().contains(username));
        });
    }


}
