package com.quandoo;

import com.codeborne.selenide.WebDriverRunner;
import com.quandoo.driver.ChromeWebDriver;
import com.quandoo.pages.HoversPage;
import com.quandoo.pages.LoginPage;
import com.quandoo.pages.TablesPage;
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

    public LoginPage loginPage;
    public HoversPage hoversPage;
    public TablesPage tablesPage;
    protected WebDriver driver;

    @Before
    public void buildDriver() {
        driver = ChromeWebDriver.getWebDriverInstance();
        driver.manage().window().maximize();
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
        loginPage = new LoginPage(driver);
        hoversPage = new HoversPage(driver);
        tablesPage = new TablesPage(driver);
    }
}
