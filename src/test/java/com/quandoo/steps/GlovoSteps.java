package com.quandoo.steps;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.openqa.selenium.By;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.quandoo.pages.BasePage.faker;


public class GlovoSteps implements En {
    public GlovoSteps() {
        When("I fill in the Contact Form:", (DataTable table) -> {
            List<Map<String, String>> formFields = table.asMaps();
            for (Map<String, String> fields : formFields) {
                fields.forEach((field, value) -> {
                    SelenideElement element = $(By.name(field));
                    if (field.equals("name") && value.equals("random")) {
                        String name = faker.name().fullName();
                        element.setValue(name);
                    } else if (field.equals("email") && value.equals("random")) {
                        String email = faker.internet().emailAddress();
                        element.setValue(email);
                    } else if (field.equals("phone") && value.equals("random")) {
                        String phone = faker.phoneNumber().cellPhone();
                        element.setValue(phone);
                    } else if (field.equals("businessName") && value.equals("random")) {
                        String business = faker.company().name();
                        element.setValue(business);
                    } else if(field.equals("postal") && value.equals("random")){
                        String code = faker.address().zipCode();
                        element.setValue(code);
                    } else if (field.equals("businessType") || field.equals("city")){
                        element.selectOption(value);
                    }
                    else {
                        element.setValue(value);
                    }
                });
            }

        });
    }
}
