package com.herokuapp.pages;

import com.github.javafaker.Faker;
import com.herokuapp.util.PropertiesLoader;

import java.util.List;


/**
 * BasePage
 * Class implements the base methods and fields.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class BasePage {
    Faker faker = new Faker();

    public static String basicURL = PropertiesLoader.loadProperty("url");
    public static String userName;

    public List<String> randUserData(List<String> userData){
        for(int i = 0; i < userData.size(); i++){
            if (userData.get(i).contains("name")){
                userName = faker.name().fullName();
                userData.set(i, userName);
            }
            if (userData.get(i).contains("email")){
                userData.set(i, faker.internet().emailAddress());
            }
            if (userData.get(i).contains("password")){
                userData.set(i, faker.internet().password());
            }
        }
        return userData;
    }
}
