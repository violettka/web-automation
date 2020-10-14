package com.herokuapp.steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class LoginSteps implements En {

    private String username;
    private String password;

    public LoginSteps() {

        When("I enter user credentials:", (DataTable table) -> {
            // convert data table to List of maps
            List<Map<String, String>> credentials = table.asMaps();

            //get the credential values by the keys
            username = credentials.get(0).get("username");
            password = credentials.get(0).get("password");
        });

        Then("I see successful login message", () -> {
            $("input").shouldHave(exactText("Some text"));
        });
    }
}
