package com.quandoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * HoversPage
 * Class implements the hover methods and fields of the Hovers page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HoversPage extends BasePage {

    /* properties */

    public static By user1 = By.cssSelector("h5");
    public static By user2 = By.xpath("//div[@id='content']/div/div[2]/div/h5");
    public static By user3 = By.xpath("//div[@id='content']/div/div[3]/div/h5");

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    public static void checkUsername(String username) {
        if (username.equals("user1"))
            assert ($(user1).getText().contains(username));
        if (username.equals("user2"))
            assert ($(user2).getText().contains(username));
        if (username.equals("user3"))
            assert ($(user3).getText().contains(username));
    }

    public static By generateXpath(String index) {
        return By.xpath("(//img[@alt='User Avatar'])[" + index + "]");
    }
}
