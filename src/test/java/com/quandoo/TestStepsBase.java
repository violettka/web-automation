package com.quandoo;

import com.codeborne.selenide.WebDriverRunner;
import com.quandoo.driver.ChromeWebDriver;
import com.quandoo.pages.HoversPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

/**
 * TestStepsBase
 * Base class for test steps implementation.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class TestStepsBase {

    public HoversPage hoversPage;
    protected WebDriver driver;

    @Before
    public void buildDriver() {
        driver = ChromeWebDriver.getWebDriverInstance();
        initPageObjects();
        WebDriverRunner.setWebDriver(driver);//set Selenide WebDriver
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    private void initPageObjects() {
        hoversPage = new HoversPage(driver);
    }
}
