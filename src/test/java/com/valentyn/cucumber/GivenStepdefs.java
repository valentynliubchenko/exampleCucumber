package com.valentyn.cucumber;

import com.valentyn.Auto;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class GivenStepdefs {
    protected final TestContext testContext = TestContext.getInstance();
    @Given("the following autos exist")
    public void theFollowingAutosExist(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (int i = 1; i < rows.size(); i++) {
            List<String> columns = rows.get(i);
            testContext.getAutos().add(new Auto(columns.get(0), Integer.parseInt(columns.get(1))));
        }

        //check
        for (var a:testContext.getAutos()  ) {
            System.out.println(a);
        }
    }

    @Given("the following autos exist Example second")
    public void theFollowingAutosExistExampleSecond(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> auto : rows) {
            String title = auto.get("name");
            String power = auto.get("power");
            // Добавьте логику для сохранения книг в магазине
            testContext.getAutos().add(new Auto(title, Integer.parseInt(power)));
        }
        //check
        for (var a:testContext.getAutos()  ) {
            System.out.println(a);
        }

    }

    @Given("the following autos exist Example third")
    public void theFollowingAutosExistExampleThird(List<Auto> autos) {
        System.out.println("theFollowingAutosExistExampleThird");
        testContext.setAutos(autos);
        //check
        for (var a:testContext.getAutos()  ) {
            System.out.println(a);
        }
    }
}
