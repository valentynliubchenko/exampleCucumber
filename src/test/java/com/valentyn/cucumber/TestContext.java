package com.valentyn.cucumber;

import com.valentyn.Auto;
import com.valentyn.Calculator;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class TestContext {

    private static final ThreadLocal<TestContext> testContext = new ThreadLocal<>();

    Calculator calculator = new Calculator(0);

    private List<Auto> autos = new ArrayList<>();
    private Auto foundAuto;
    public static TestContext getInstance() {
        if (testContext.get() == null) {
            testContext.set(new TestContext());
        }
        return testContext.get();
    }

    public static void dropInstance() {
        testContext.set(null);
    }
}