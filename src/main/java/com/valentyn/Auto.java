package com.valentyn;

import lombok.Data;

@Data
public class Auto {
    private String name;
    private int power;

    public Auto(String name, int power) {
        this.name = name;
        this.power = power;
    }

}
