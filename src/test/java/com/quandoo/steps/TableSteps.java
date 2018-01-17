package com.quandoo.steps;

import cucumber.api.java8.En;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.quandoo.pages.TablesPage.*;

/**
 * TableSteps
 * Class implements the step definitions for testing the table Example 2 on the Tables page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class TableSteps implements En {

    List<String> columnTextsBeforeClick;

    public TableSteps() {
        When("I order by Last Name", () -> {
            columnTextsBeforeClick = $$(lastNameColumn).texts();
            $(lastNameHeader).click();
        });

        Then("I see (.*) order of the entries", (String order) -> {
            verifyEntriesOrder(order, columnTextsBeforeClick);
        });
    }
}