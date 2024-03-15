package com.valentyn;

public class MyApp {
    public static void main(String[] args) {

        if(args.length > 0) {
            System.out.println(GenerationMessage(args[0]));
        }
        else {
            System.out.println("Hello world");
        }
    }
    public static String GenerationMessage(String name){
        if(name.length()>0) {
            return "Hello " + name;
        }
        else {
            return "Hello World";
        }
    }

}
