package com.valentyn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyApp {

    @Test
    public void test(){
        String str = "Hello";
        Assertions.assertEquals(str, "Hello");

    }

    @Test
    public void testGenerationMessageWithName(){
        String str = MyApp.GenerationMessage("Valentyn");
        Assertions.assertEquals(str, "Hello Valentyn");

    }

    @Test
    public void testGenerationMessageWithJohn(){
        String str = MyApp.GenerationMessage("John");
        Assertions.assertEquals(str, "Hello John");

    }

    @Test
    public void testGenerationMessageWithOutName(){
        String str = MyApp.GenerationMessage("");
        Assertions.assertEquals(str, "Hello World");

    }


}
