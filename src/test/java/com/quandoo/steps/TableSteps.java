package com.quandoo.steps;

import cucumber.api.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.IntStream;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.quandoo.TestStepsBase.*;

/**
 * TableSteps
 * Class implements the step definitions for testing the table Example 2 on the Tables page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class TableSteps implements En {

    public TableSteps() {
        When("I order by Last Name", () -> {
            $(lastName).click();
        });

        Then("I see (.*) order of the entries", (String order) -> {
            List<String> lastNameColumn = $$(By.xpath("//*[@id=\"table2\"]/tbody/tr/td[1]")).texts();
                for(String row : lastNameColumn){
                    System.out.println(row);
                }
        });

        And("entries are ordered alphabetically", () -> {

        });
    }
}
