package com.quandoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertNotEquals;

/**
 * TablesPage
 * Class implements the hover methods and fields of the Tables page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class TablesPage extends BasePage {

    /* selectors */

    public static By lastNameHeader = By.cssSelector("span.last-name");
    public static By lastNameColumn = By.xpath("//*[@id=\"table2\"]/tbody/tr/td[1]");

    public TablesPage(WebDriver driver) {
        super(driver);
    }

    public static void verifyEntriesOrder(String order, List<String> columnTextsBeforeClick) {
        if (order.equals("ascending")) {
            List<String> ascendingLastName = columnTextsBeforeClick.stream().sorted().collect(Collectors.toList());
            assertNotEquals(ascendingLastName, columnTextsBeforeClick);
        }
        if (order.equals("descending")) {
            List<String> descendingLastName = columnTextsBeforeClick.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            assertNotEquals(descendingLastName, columnTextsBeforeClick);
        }
    }
}
