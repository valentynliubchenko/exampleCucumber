package com.valentyn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("an example scenario")
    public void anExampleScenario() {
        System.out.println("an example scenario");
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
        System.out.println("all step definitions are implemented");
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
        System.out.println("the scenario passes");
    }
}
