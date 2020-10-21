package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage() {

    }

    public static final By inputUsername = By.id("username");
    public static final By inputPassword = By.id("password");
    public static final By loginBtn = By.xpath("//i[contains(text(),'Login')]");

}
