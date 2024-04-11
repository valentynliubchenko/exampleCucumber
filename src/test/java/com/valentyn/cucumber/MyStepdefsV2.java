package com.valentyn.cucumber;

import com.valentyn.Auto;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MyStepdefsV2 {
    @Given("the following autos exist Example fifth")
    public void theFollowingAutosExistExampleFifth(@Transpose Auto auto) {
        System.out.println("AutoNew: " + auto);
        TestContext.getInstance().setFoundAuto(auto);
    }

    @When("I search named {string}")
    public void iSearchNamed(String name) {
        System.out.println("name = " + name);

    }
}
