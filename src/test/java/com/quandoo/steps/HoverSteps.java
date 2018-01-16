package com.quandoo.steps;

import com.quandoo.PropertiesLoader;
import cucumber.api.java8.En;
import javafx.geometry.BoundingBox;
import org.openqa.selenium.By;

import java.util.stream.IntStream;

import static com.codeborne.selenide.Selenide.$;
import static com.quandoo.TestStepsBase.*;

/**
 * HoverSteps
 * Class implements the step definitions for testing the Hovers page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HoverSteps implements En {
    public HoverSteps() {

        When("I hover avatar (.*)", (String index) -> {
            $(By.xpath(("(//img[@alt='User Avatar'])[" + index + "]"))).hover();
        });

        Then("I observe the (.*) username", (String username) -> {
            if (username.equals("user1"))
                assert ($(user1).getText().contains(username));
            if (username.equals("user2"))
                assert ($(user2).getText().contains(username));
            if (username.equals("user3"))
                assert ($(user3).getText().contains(username));
        });
    }
}
