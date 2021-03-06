package de.moemax.steps;

import com.codeborne.selenide.Condition;
import de.moemax.pages.Filterpage;
import de.sconto.pages.HomePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static de.moemax.pages.Filterpage.basicURL;

public class FilterpageSteps implements En {

    Filterpage filterpage;
    String filterMarke;

    public void filterpageSteps() {
        Given("I am on the Moemax page", () -> {
            filterpage = open(basicURL + "/s", Filterpage.class);
        });

        When("I choise Marke", () -> {
            filterpage.choiseMarke();
        });
        Then("I choise {} Marke", (String specificMarke) -> {
            filterMarke = specificMarke;
            filterpage.choiseSpecificMarke(specificMarke);

        });
        Then("I see only selected Marke", () -> {
            filterpage.resultMarke().shouldHave(Condition.attribute(filterMarke));
        });

    }
}
