package com.valentyn.cucumber;

import com.valentyn.Auto;
import io.cucumber.java.en.When;

public class WhenStepdefs {
    protected final TestContext testContext = TestContext.getInstance();
    @When("I search for the auto named {string}")
    public void iSearchForTheAutoNamed(String name) {
        for (Auto auto : testContext.getAutos()) {
            if (auto.getName().equals(name)) {
                testContext.setFoundAuto(auto);
                break;
            }
        }
    }
}
