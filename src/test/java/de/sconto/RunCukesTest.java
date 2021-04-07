package de.sconto;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import io.cucumber.java8.En;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "de.sconto",
        strict = true
)
public class RunCukesTest implements En {
    public RunCukesTest() {

        Before(() -> {
            Configuration.remote = "http://localhost:4445/wd/hub";
            Configuration.browserCapabilities.setCapability("enableVNC", true);
            Configuration.browserCapabilities.setCapability("enableVideo", true);
            Configuration.browser = "chrome";
            Configuration.browserVersion = "71.0";
        });
    }
}