package com.valentyn.cucumber;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class ThenStepdefs {
    protected final TestContext testContext = TestContext.getInstance();
    @Then("I should find an auto with {int} horsepower")
    public void iShouldFindAnAutoWithHorsepower(int power) {
        Assertions.assertNotNull(testContext.getFoundAuto());
        Assertions.assertEquals(power, testContext.getFoundAuto().getPower());
    }

    @Then("I should not find an auto")
    public void iShouldNotFindAnAuto() {
        Assertions.assertNull(testContext.getFoundAuto());
    }
}
