package com.herokuapp.steps;

import com.github.javafaker.Faker;
import com.herokuapp.pages.BusinessAccountPage;
import com.herokuapp.pages.GlovoPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;
import static com.herokuapp.pages.BasePage.userName;

public class GlovoSteps {
    GlovoPage page;
    BusinessAccountPage baPage;

    @When("I fill in the Signup form:")
    public void fillInForm(DataTable table) {
        page = page(GlovoPage.class);
        List<String> randData = page.randUserData(new ArrayList<String>(table.asList()));
        page.fillInSignupForm(randData);
    }

    @When("I click Signup button")
    public void clickButtonSignup() {
        page.clickSignupBtn();
    }

    @Then("I see {} view")
    public void privacyView(String view) {
        if (view.contains("Privacy"))
            page.privacyView().shouldHave(text(view));
        if (view.contains("Login Verification")) {
            page.loginVerification().shouldHave(text(view));
        }
    }

    @When("I accept Terms and Conditions")
    public void clickChekbox() {
        page.clickCheckbox();
        page.clickContinueBtn();
    }

    @When("I click Skip button")
    public void clickSkip() {
        baPage = page.clickSkipBtn();
    }

    @Then("I see Order list")
    public void checkOrderList() {
        baPage.orderList().should(exist);
    }

    @Then("I see user name")
    public void checkUserName() {
        baPage.userName().shouldHave(text(userName));
    }
}
