package com.herokuapp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
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
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
        caps.setCapability(MobileCapabilityType.UDID, "699B5875-B45D-4BA7-BB0D-550E28797700");
        caps.setCapability("nativeWebTap", true);
        caps.setCapability("noReset", true);
        URL url = null;
        try {
            url = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new IOSDriver(url, caps);
    }
}