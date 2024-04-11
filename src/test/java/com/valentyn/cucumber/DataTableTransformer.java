package com.valentyn.cucumber;

import com.valentyn.Auto;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableTransformer {

    @DataTableType
    public Auto defineAuto(Map<String, String> entry) {
        Auto auto = new Auto();
        if (entry.containsKey("name"))
            auto.setName(entry.get("name"));
        if (entry.containsKey("Title"))
            auto.setPower(Integer.parseInt(entry.get("name")));
        return (new Auto(entry.get("name"), Integer.parseInt(entry.get("power"))));
    }
}
