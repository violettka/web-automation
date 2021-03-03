package com.herokuapp.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchSteps implements En {

    public SearchSteps(){

        Given("I open Search page", () -> {
            open("https://www.moemax.de/s/");
            $(By.xpath("//button[@data-purpose='cookieBar.button.accept']")).click();
        });

        When("I search for the {} color", (String color) -> {
            String xpath = "//span[contains(text(),'" + color +  "')]";
            $(By.xpath("//span[contains(text(),'Farbe')]")).click();
            $(By.xpath(xpath)).click();
        });

        Then("I see the filter {} is applied", (String color) ->{
            $(By.xpath("//li/div/div/span")).shouldHave(text(color));
        });
    }
}
