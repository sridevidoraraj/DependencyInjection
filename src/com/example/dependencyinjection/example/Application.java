package com.example.dependencyinjection.example;

public class Application {

    private Service email = new Service();

    public void processMessages(String msg, String rec){

        this.email.sendEmail(msg, rec);

    }
}
