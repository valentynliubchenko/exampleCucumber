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

    @Then("I get same auto {string}")
    public void igetSameAuto(String name) {
        Assertions.assertNotNull(testContext.getFoundAuto());
        Assertions.assertEquals(name, testContext.getFoundAuto().getName());
    }
}
