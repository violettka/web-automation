package com.herokuapp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GlovoPage extends BasePage {

    private static final By inputName = By.xpath("//input[@name='inner_name']");
    private static final By inputEmail = By.xpath("//input[@name='inner_email']");
    private static final By inputPassword = By.xpath("//input[@name='inner_password']");
    private static final By clickButtonSignup = By.xpath("//button[@data-test-id='signup-submit']");
    private static final By clickCheckbox = By.cssSelector(".privacy__term:nth-child(2) .el-checkbox__inner");
    private static final By clickButtonContinueAndRegister = By.xpath("//button[@data-test-id='submit-terms-conditions']");
    private static final By privacyView = By.tagName("h1");
    private static final By loginVerification = By.tagName("b");
    private static final By skipBtn = By.xpath("//span[contains(text(),'No, thanks')]");

    public void fillInSignupForm(List<String> randData) {
        $(inputName).setValue(randData.get(0));
        $(inputEmail).setValue(randData.get(1));
        $(inputPassword).setValue(randData.get(2));
    }

    public void clickSignupBtn() {
        $(clickButtonSignup).shouldHave(Condition.exist).click();
    }

    public void clickCheckbox() {
        $(clickCheckbox).click();
    }

    public void clickContinueBtn() {
        $(clickButtonContinueAndRegister).shouldHave(Condition.exist).click();
    }

    public SelenideElement privacyView() {
        return $(privacyView);
    }

    public SelenideElement loginVerification() {
        return $(loginVerification);
    }

    public BusinessAccountPage clickSkipBtn() {
        $(skipBtn).click();
        return page(BusinessAccountPage.class);
    }
}
