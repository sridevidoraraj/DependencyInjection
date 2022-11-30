package com.example.dependencyinjection.example;

public class Service {

    public void sendEmail(String message, String receiver){

        if(message.isEmpty() && receiver.isEmpty()){
            System.out.println("not valid");
        }
        System.out.println("Email sent to : "+receiver+ " with Message : " +message);
    }
}
