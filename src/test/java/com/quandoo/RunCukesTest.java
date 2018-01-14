package com.quandoo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber-report.json", glue = "com.quandoo")
public class RunCukesTest {
}