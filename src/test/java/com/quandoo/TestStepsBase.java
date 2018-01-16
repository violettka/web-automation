package com.quandoo;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * TestStepsBase
 * Base class for test steps implementation.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class TestStepsBase {
    protected WebDriver driver;

    /* properties */

    public static String basicURL = PropertiesLoader.loadProperty("url");
    public static String existingUsername = PropertiesLoader.loadProperty("existing.username");
    public static String existingPassword = PropertiesLoader.loadProperty("existing.password");
    public static String successfulLoginMessage = PropertiesLoader.loadProperty("positive.login.message");

    /* selectors */

    public static By usernameField = By.cssSelector("#username");
    public static By passwordField = By.cssSelector("#password");
    public static By loginButton = By.cssSelector("button.radius");
    public static By textMessage = By.cssSelector("#flash");
    public static By user1 = By.cssSelector("h5");
    public static By user2 = By.xpath("//div[@id='content']/div/div[2]/div/h5");
    public static By user3 = By.xpath("//div[@id='content']/div/div[3]/div/h5");
    public static By lastName = By.cssSelector("span.last-name");

    @Before
    public void buildDriver() {
        driver = ChromeWebDriver.getWebDriverInstance();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver); //set Selenide WebDriver
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
