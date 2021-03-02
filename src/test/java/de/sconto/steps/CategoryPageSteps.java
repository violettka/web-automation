package de.sconto.steps;

import com.codeborne.selenide.Condition;
import de.sconto.pages.CategoryPage;
import de.sconto.pages.HomePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public class CategoryPageSteps implements En {
    HomePage homePage;
    CategoryPage categoryPage;

    public CategoryPageSteps() {

        Then("I see Sofas Category Page", () -> {
            categoryPage.checkSofasPageTitle().should(exist);
            categoryPage.checkSofasPageTitle().shouldHave(Condition.text("Sofas"));
        });

        When("I click on Sofas", () -> {
            homePage = page(HomePage.class);
            categoryPage = homePage.clickOnCategory();
        });

        When("I click on Heart element", () -> {
            categoryPage.addingToWishlist();
        });

        Then("I see pop-up window", () -> {
            categoryPage.checkPopUp().should(exist);
        });


    }

}
