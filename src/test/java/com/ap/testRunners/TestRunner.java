package com.ap.testRunners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/"},
        glue = {"com.ap.stepDefinitions"},
        tags = {"~@wip"})
public class TestRunner {
}
