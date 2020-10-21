package com.herokuapp.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.HoversPage.user3;
import static com.herokuapp.pages.SecureAreaPage.pageTitle;
import static org.openqa.selenium.By.tagName;

public class SecureAreaSteps implements En {
    public SecureAreaSteps(){
        Then("I see text Secure Area", () -> {
            $(pageTitle).shouldHave(text("Secure Area"));
        });

    }
}
