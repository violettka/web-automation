package de.moemax;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "de.moemax",
        strict = true,
        tags = "@moemax"
)

//мар 07, 2021 12:57:06 AM io.cucumber.core.runtime.FeaturePathFeatureSupplier get
//WARNING: No features found at classpath:/de/moemax

public class RunCukesTest {
}