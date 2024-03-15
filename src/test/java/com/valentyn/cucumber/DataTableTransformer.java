package com.valentyn.cucumber;

import com.valentyn.Auto;
import io.cucumber.java.DataTableType;

import java.util.List;
import java.util.Map;

public class DataTableTransformer {

    @DataTableType
    public Auto defineAuto(Map<String, String> entry) {
        return(new Auto(entry.get("name"), Integer.parseInt(entry.get("power"))));
    }
}
