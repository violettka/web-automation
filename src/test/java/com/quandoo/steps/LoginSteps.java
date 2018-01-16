package com.quandoo.steps;

import com.quandoo.PropertiesLoader;
import cucumber.api.java8.En;

import static com.codeborne.selenide.Selenide.$;
import static com.quandoo.TestStepsBase.*;

/**
 * LoginSteps
 * Class implements the step definitions for testing the Login page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class LoginSteps implements En {

    public LoginSteps() {

        When("I login with (.*) credentials", (String credentials) -> {
            if (credentials.equals("existing")) {
                $(usernameField).setValue(existingUsername);
                $(passwordField).setValue(existingPassword);
            }
            if (credentials.equals("wrong.username")) {
                $(usernameField).setValue(PropertiesLoader.loadProperty(credentials));
                $(passwordField).setValue(existingPassword);
            }
            if (credentials.equals("wrong.password")) {
                $(usernameField).setValue(existingUsername);
                $(passwordField).setValue(PropertiesLoader.loadProperty(credentials));
            }
            $(loginButton).click();
        });

        Then("I observe the (.*) login message", (String message) -> {
            String messageText = $(textMessage).getText();

            if (message.equals("successful")) {
                assert (messageText.contains(successfulLoginMessage));
            } else {
                assert (messageText.contains(PropertiesLoader.loadProperty(message)));
            }
        });
    }
}
