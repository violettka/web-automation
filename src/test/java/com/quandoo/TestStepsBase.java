package com.quandoo;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

/**
 * TestStepsBase
 * Base class for test steps implementation.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class TestStepsBase {
    protected WebDriver driver;

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
