package com.herokuapp.steps;


import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.herokuapp.pages.BasePage.basicURL;

/**
 * CommonSteps
 * Class implements the common step definitions for several feature files.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class CommonSteps implements En {
    public CommonSteps() {

        Given("I am on the Hovers page", () -> {
            open(basicURL + "/hovers");
            IOSDriver driver = (IOSDriver) WebDriverRunner.getWebDriver();
            driver.switchTo().window(driver.getWindowHandle());
        });
    }
}
