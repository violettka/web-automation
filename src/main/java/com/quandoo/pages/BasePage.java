package com.quandoo.pages;

import com.quandoo.util.PropertiesLoader;
import org.openqa.selenium.WebDriver;

/**
 * BasePage
 * Class implements the base methods and fields.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class BasePage {

    public static String basicURL = PropertiesLoader.loadProperty("url");

     /* properties */
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
