package com.herokuapp.pages;

import com.herokuapp.util.PropertiesLoader;
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

    public static String successfulLoginMessage = PropertiesLoader.loadProperty("positive.login.message");

}
