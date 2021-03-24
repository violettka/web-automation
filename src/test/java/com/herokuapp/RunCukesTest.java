package com.herokuapp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java8.En;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "com.herokuapp",
        strict = true
)
public class RunCukesTest implements WebDriverProvider, En {
    private AppiumDriverLocalService service;

    public RunCukesTest() {

        Before(() -> {
            service = AppiumDriverLocalService.buildDefaultService();
            service.start();
            Configuration.browser = RunCukesTest.class.getName();
            Configuration.browserSize = null;
            Configuration.startMaximized = false;
        });

        After(() -> {
            closeWebDriver();
            service.stop();
        });
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities caps) {
        caps.setCapability("noReset", "false");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        caps.setCapability("chromedriverExecutable", "/usr/local/bin/chromedriver");
        URL url = null;
        try {
            url = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AndroidDriver(url, caps);
    }
}