package com.herokuapp.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.HoversPage.user3;
import static org.openqa.selenium.By.tagName;

public class UserSteps implements En {
    public UserSteps() {

    Then("I observe {} text", (String text) -> {
        $(tagName("h1")).shouldHave(text(text));
    });
    }

}
