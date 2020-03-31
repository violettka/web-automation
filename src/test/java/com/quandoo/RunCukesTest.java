package com.quandoo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.logging.Logger;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-report.json", "pretty"}, glue = "com.quandoo", strict = true)
public class RunCukesTest {
}