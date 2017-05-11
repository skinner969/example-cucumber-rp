package com.example.rp.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyStepdefs {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyStepdefs.class);

    @When("^some random step$")
    public void someRandomStep() throws Throwable {
        LOGGER.error("SOME RANDOM MESSAGE", "SOME RANDOM MESSAGE", "SOME RANDOM MESSAGE");
    }

    @Then("^random assertion$")
    public void randomAssertionStep() throws Throwable {
        Assert.assertTrue(true);
        LOGGER.error("SUCCESS", "SUCCESS", "SUCCESS");
    }

}
