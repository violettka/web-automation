package com.herokuapp.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BusinessAccountPage extends BasePage {

    private static final By orderList = By.xpath("//div[contains(text(),'NEW ORDER')]");
    private static final By userName = By.xpath("//*[@id=\"top-bar\"]/div/div[2]/div/span");

    public SelenideElement orderList() {
        return $(orderList);
    }

    public SelenideElement userName() {
        return $(userName);
    }
}
