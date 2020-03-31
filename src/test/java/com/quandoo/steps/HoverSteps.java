package com.quandoo.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.matchesText;
import static com.codeborne.selenide.Selenide.$;


/**
 * HoverSteps
 * Class implements the step definitions for testing the Hovers page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HoverSteps implements En {
    public HoverSteps() {

        When("I hover avatar 3", () -> {
            $(By.xpath("//div[3]//img[1]")).hover();
        });

        Then("I observe the user3 username", () -> {
            $(By.xpath("//div[3]/div/h5")).shouldHave(matchesText("user3"));
        });

        When("I click on View profile link", () -> {
            $(By.linkText("View profile")).click();
        });

        Then("I see Not Found message on User page", () -> {
            $(By.cssSelector("h1")).shouldHave(exactText("Not Found"));
        });
    }


}
