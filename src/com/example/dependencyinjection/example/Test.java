package com.example.dependencyinjection.example;

public class Test {

    public static void main(String[] args) {
        Application app = new Application();
        app.processMessages("hi", "sam@gmail.com");
    }

}
