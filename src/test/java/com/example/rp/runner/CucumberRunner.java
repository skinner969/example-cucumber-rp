package com.example.rp.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.example.rp.steps"},
        features = "src/test/resources/features",
        tags = "@logging",
        plugin = {"com.epam.reportportal.cucumber.ScenarioReporter", "pretty", "html:target/cucumber"}
)
public class CucumberRunner{
}
