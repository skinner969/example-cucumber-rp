package com.example.rp.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class MyStepdefs {

    private static final Logger LOGGER = LogManager.getLogger(MyStepdefs.class);

    @When("^some random step$")
    public void someRandomStep() throws Throwable {
        for (int k = 0; k < 3; k++) {
            Thread.sleep(3000);
            LOGGER.error("SOME RANDOM MESSAGE");
        }
    }

    @Then("^random assertion$")
    public void randomAssertionStep() throws Throwable {
        Assert.assertTrue(true);
        LOGGER.error("SUCCESS");
    }

}
