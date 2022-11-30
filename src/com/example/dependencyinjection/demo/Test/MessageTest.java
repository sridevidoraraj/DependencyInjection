package com.example.dependencyinjection.demo.Test;

import com.example.dependencyinjection.demo.consumer.Consumer;
import com.example.dependencyinjection.demo.injector.EmailServiceInjector;
import com.example.dependencyinjection.demo.injector.MessageServiceInjector;
import com.example.dependencyinjection.demo.injector.SmsServiceInjector;

public class MessageTest {
    public static void main(String[] args) {
        String msg = "Hi";
        String email = "sam@gmail.com";
        String phone = "123456789";
        MessageServiceInjector injector = null;
        Consumer app = null;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        injector = new SmsServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
