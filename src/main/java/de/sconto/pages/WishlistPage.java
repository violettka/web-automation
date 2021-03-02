package de.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WishlistPage {

    private static By wishlistPageTitle = By.xpath("(//h1[@class='wishlistOverview__headerTitle'])[1]");
    private static By addToBasketBtn = By.xpath("//button[@class='button button--addToCartSmall']");
    private static By sofaNameWish = By.xpath("//*[contains(text(),'Palina')]");
    private static By wishlistIcon = By.xpath("//span[@class=\"headerElement__status headerElement__status--wishlist\"]");

    public SelenideElement checkPageTitle() {
        return $(wishlistPageTitle);
    }

    public SelenideElement checkAddToBasketBtn() {
        return $(addToBasketBtn);
    }

    public SelenideElement checkSofasName() {
        return $(sofaNameWish);
    }

    public SelenideElement checkBasketNumber() {
        return $(wishlistIcon);
    }
}
