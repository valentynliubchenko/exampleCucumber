package com.valentyn;

import lombok.Data;

@Data
public class AutoNew {
    private String name;
    private int power;

    public AutoNew(String name, int power) {
        this.name = name;
        this.power = power;
    }

}
