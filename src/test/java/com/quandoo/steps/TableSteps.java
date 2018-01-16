package com.quandoo.steps;

import cucumber.api.java8.En;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.quandoo.TestStepsBase.lastNameColumn;
import static com.quandoo.TestStepsBase.lastNameHeader;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertNotEquals;

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
            if (order.equals("ascending")) {
                List<String> ascendingLastName = columnTextsBeforeClick.stream().sorted().collect(Collectors.toList());
                assertNotEquals(ascendingLastName, columnTextsBeforeClick);
            }
            if (order.equals("descending")) {
                List<String> descendingLastName = columnTextsBeforeClick.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
                assertNotEquals(descendingLastName, columnTextsBeforeClick);
            }
        });
    }
}