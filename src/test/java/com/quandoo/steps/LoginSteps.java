package com.quandoo.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.docstring.DocString;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;



public class LoginSteps implements En {
    String username;
    String password;
    public LoginSteps(){

        When("I enter credentials:", (DataTable table) -> {
            List<Map<String, String>> credentials = table.asMaps();
            username = credentials.get(0).get("username");
            password = credentials.get(0).get("password");
            System.out.println(username);
            System.out.println(password);
        });

        Then("I see message:", (DocString message) -> {
            String msg = message.getContent();
            System.out.println(msg);
        });
    }


}
