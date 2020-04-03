package com.quandoo.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java8.En;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;


public class ChallengingDomSteps implements En {
    String buttonText;
    public ChallengingDomSteps() {

        When("I click on the blue button", () -> {
           buttonText = $(By.xpath("//div/div/a")).getText();
            $(By.xpath("//div/div/a")).click();
        });

        Then("I see that blue button text had changed", () -> {
            $(By.xpath("//div/div/a")).shouldNotHave(exactText(buttonText));
        });
    }
}
