package com.valentyn.cucumber;

import com.valentyn.Auto;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataTableTransformer {

    @DataTableType
    public Auto defineAuto(Map<String, String> entry) {
        return (new Auto(entry.get("name"), Integer.parseInt(entry.get("power"))));
    }

    @DataTableType
    public Auto defineAutoNew(DataTable entry) {
        List<List<String>> listOfLists = entry.cells();
        Map<String, String> keyValueMap = listOfLists.stream()
                .collect(Collectors.toMap(
                        innerList -> innerList.get(0),
                        innerList -> innerList.get(1)
                ));
        return (new Auto(keyValueMap.get("name"), Integer.parseInt(keyValueMap.get("power"))));
    }
}
