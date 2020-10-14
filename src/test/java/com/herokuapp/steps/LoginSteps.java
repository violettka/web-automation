package com.herokuapp.steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.LoginPage.*;

public class LoginSteps implements En {

    public LoginSteps() {

        When("I enter user credentials:", (DataTable table) -> {
            // convert data table to List of maps
            List<Map<String, String>> credentials = table.asMaps();

            // get the credential values by the keys
            String username = credentials.get(0).get("username");
            String password = credentials.get(0).get("password");

            // input credentials
            $(usernameField).setValue(username);
            $(passwordField).setValue(password);

            // login
            $(loginButton).click();
        });

        Then("I see successful login message", () -> {
            $(textMessage).shouldHave(text(successfulLoginMessage));
        });
    }
}
