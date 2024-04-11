package com.valentyn.cucumber;

import com.valentyn.Auto;
import com.valentyn.AutoNew;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

public class MyStepdefsV2 {
    @Given("the following autos exist Example fifth")
    public void theFollowingAutosExistExampleFifth(Auto auto) {
        System.out.println("AutoNew: " + auto);
    }

    @When("I search named {string}")
    public void iSearchNamed(String name) {
        System.out.println( "name = " + name);
    }
}
