package de.moemax.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.sconto.pages.LoginPage;
import de.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Filterpage {
    public static String basicURL = "https://www.moemax.de";

    /* Elements */

    private static By acceptBtn = By.xpath("//button[@data-purpose='cookieBar.button.accept']");
    private static By filterMarke = By.xpath("//span[contains(text(),'Marke')]");
    //in method
    private static By filterMarkeelement = By.xpath("//span[contains(text(), 'AEG')]");
    private static By resultMarke = By.cssSelector("._2uE_EjD8EJAlhOA7");




    public void acceptCookies(){
        if ($(acceptBtn).exists()) {
            $(acceptBtn).click();
        }
    }

    public void choiseMarke() {
        $(filterMarke).click();
    }

    public void choiseSpecificMarke(String specificMarke){
        filterMarkeelement = By.xpath("//span[contains(text(), '" + specificMarke + "')]");

    }
    public SelenideElement resultMarke(){
        return $(resultMarke);
    }


}
