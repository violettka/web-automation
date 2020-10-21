package com.herokuapp.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.HoversPage.generateXpath;
import static com.herokuapp.pages.LoginPage.inputPassword;
import static com.herokuapp.pages.LoginPage.inputUsername;
import static com.herokuapp.pages.LoginPage.loginBtn;

public class LoginSteps implements En {
    public LoginSteps(){

        When("I enter user credentials:", (DataTable table) -> {
            List<Map<String, String>> dataTable = table.asMaps();

            String username = dataTable.get(0).get("username");
            String password = dataTable.get(0).get("password");

            $(inputUsername).setValue(username);
            $(inputPassword).setValue(password);
        });

        When("I click on the Login button", () -> {
            $(loginBtn).click();
        });
    }
}
