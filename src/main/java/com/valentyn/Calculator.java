package com.valentyn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculator {
    private int a;

    public Calculator(int val){
        a = Math.abs(val);
    }
    public void add(int b){
        a+=Math.abs(b);
    }

}
