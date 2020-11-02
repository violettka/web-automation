package com.herokuapp.pages;

import com.herokuapp.util.PropertiesLoader;

/**
 * BasePage
 * Class implements the base methods and fields.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class BasePage {

    public static String basicURL = PropertiesLoader.loadProperty("url");

}
