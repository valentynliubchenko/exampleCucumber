package com.valentyn.cucumber;

import com.valentyn.Calculator;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {


    protected final TestContext testContext = TestContext.getInstance();
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

    @Given("Calculator with value {int}")
    public void calculatorWithValue(int val) {
        testContext.setCalculator(new Calculator(val));
    }

    @When("call add method with value {int}")
    public void callAddMethodWithValue(int addValue) {
        testContext.getCalculator().add(addValue);
    }

    @Then("The value will be {int}")
    public void theValueWillBe(int expectedValue) {
        Assertions.assertEquals(expectedValue, testContext.getCalculator().getA());
    }

    @After
    public void tearDown() {
        TestContext.dropInstance();
        System.out.println("tearDown completed...");
    }
}
