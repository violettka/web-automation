package de.sconto.steps;

import com.codeborne.selenide.Condition;
import de.sconto.pages.CategoryPage;
import de.sconto.pages.LoginPage;
import de.sconto.pages.WishlistPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.page;

public class WishlistPageSteps implements En {
    WishlistPage wishlistPage;
    CategoryPage categoryPage;

    public WishlistPageSteps() {
        Then("I should see Wishlist", () -> {
            wishlistPage.checkPageTitle().shouldHave(Condition.text("Wunschliste"));
        });

        And("I should see added element", () -> {
            wishlistPage.checkAddToBasketBtn().should(Condition.exist);
            wishlistPage.checkSofasName().equals(categoryPage.checkSofasTitle());
            //wishlistPage.checkBasketNumber().shouldNotHave(Condition.text("0"));
        });
    }
}
