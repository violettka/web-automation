package com.quandoo.pages;

import com.quandoo.util.PropertiesLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * LoginPage
 * Class implements the hover methods and fields of the Login page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class LoginPage extends BasePage {

    /* selectors */

    public static By usernameField = By.cssSelector("#username");
    public static By passwordField = By.cssSelector("#password");
    public static By loginButton = By.cssSelector("button.radius");
    public static By textMessage = By.cssSelector("#flash");

    /* properties */

    public static String existingUsername = PropertiesLoader.loadProperty("existing.username");
    public static String existingPassword = PropertiesLoader.loadProperty("existing.password");
    public static String successfulLoginMessage = PropertiesLoader.loadProperty("positive.login.message");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static void insertCredentials(String credentials) {
        if (credentials.equals("existing")) {
            $(usernameField).setValue(existingUsername);
            $(passwordField).setValue(existingPassword);
        }
        if (credentials.equals("wrong.username")) {
            $(usernameField).setValue(PropertiesLoader.loadProperty(credentials));
            $(passwordField).setValue(existingPassword);
        }
        if (credentials.equals("wrong.password")) {
            $(usernameField).setValue(existingUsername);
            $(passwordField).setValue(PropertiesLoader.loadProperty(credentials));
        }
    }

    public static void verifyMessageText(String message) {
        String messageText = $(textMessage).getText();

        if (message.equals("successful")) {
            assert (messageText.contains(successfulLoginMessage));
        } else {
            assert (messageText.contains(PropertiesLoader.loadProperty(message)));
        }
    }
}
