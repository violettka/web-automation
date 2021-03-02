package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPage {

    private static By wishlistBtn = By.xpath("//div[@data-wish-list-entry-number=\"24407505\"]");
    private static By popUpWindow = By.xpath("//div[@class=\"wishlistLoginRequiredOverlay fancybox-content\"]");
    private static By popUpAnmeldenBtn = By.xpath("(//button[@name=\"addToWishlistLoginBox\"])[2]");
    private static By sofaName = By.xpath("//*[contains(text(),'Palina')]");
    private static By sofasPageTitle = By.cssSelector(".categoryHeadline");

    public SelenideElement checkSofasPageTitle() {
        return $(sofasPageTitle);
    }

    public void addingToWishlist() {
        $(wishlistBtn).click();
    }

    public SelenideElement checkPopUp() {
        return $(popUpWindow);
    }

    public LoginPage clickOnAnmeldenBtn() {
        $(popUpAnmeldenBtn).click();
        return Selenide.page(LoginPage.class);
    }

    public SelenideElement checkSofasTitle() {
        return $(sofaName);
    }
}
