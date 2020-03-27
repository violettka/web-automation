package com.quandoo.steps;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.$;
import static com.quandoo.pages.LoginPage.*;

/**
 * LoginSteps
 * Class implements the step definitions for testing the Login page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class LoginSteps implements En {

    public LoginSteps() {

        When("I login with {} credentials", (String credentials) -> {
            insertCredentials(credentials);
            $(loginButton).click();
        });

        Then("I observe the {} login message", (String message) -> {
            verifyMessageText(message);
        });
    }
}
