package com.herokuapp;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "com.herokuapp",
        strict = true,
        tags = "@regression"
)
public class RunCukesTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @Parameters("browser")
    @BeforeTest
    public void setupBrowser(String browser){
        if (browser.equals("Chrome")){
            System.setProperty("selenide.browser", "Chrome");
        } else if (browser.equals("Firefox")){
            System.setProperty("selenide.browser", "Firefox");
        }
    }
}

