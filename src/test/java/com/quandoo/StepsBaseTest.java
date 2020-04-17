package com.quandoo;

import com.codeborne.selenide.WebDriverRunner;
import com.quandoo.driver.ChromeWebDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import com.github.javafaker.Faker;

/**
 * StepsBaseTest
 * Base class for test steps implementation.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class StepsBaseTest {

//    public HoversPage hoversPage;
    protected WebDriver driver;
    public Faker faker;

    @Before
    public void buildDriver() {
        driver = ChromeWebDriver.getWebDriverInstance();
//        initPageObjects();
        WebDriverRunner.setWebDriver(driver);//set Selenide WebDriver
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

//    private void initPageObjects() {
//        hoversPage = new HoversPage(driver);
//    }
}
