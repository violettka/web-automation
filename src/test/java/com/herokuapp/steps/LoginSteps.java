package com.herokuapp.steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.LoginPage.*;

/**
 * LoginSteps
 * Class implements the step definitions for testing the Login page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class LoginSteps {


        @When("I enter user credentials:")
        public void enterUserCredentials(DataTable table) {
            // convert data table to List of maps
            List<Map<String, String>> credentials = table.asMaps();

            // get the credential values by the keys
            String username = credentials.get(0).get("username");
            String password = credentials.get(0).get("password");

            // input credentials
            $(usernameField).setValue(username);
            $(passwordField).setValue(password);
        }

        @When("I click on Login button")
        public void clickLoginButton(){
            // login
            $(loginButton).click();
        }

        @Then("I see successful login message")
        public void verifyLoginMessage() {
            $(textMessage).shouldHave(text(successfulLoginMessage));
        }
}
