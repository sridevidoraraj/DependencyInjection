package com.example.dependencyinjection.demo.injector;

import com.example.dependencyinjection.demo.consumer.Application;
import com.example.dependencyinjection.demo.consumer.Consumer;
import com.example.dependencyinjection.demo.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector{

    @Override
    public Consumer getConsumer() {
        Application app = new Application();
        app.setService(new EmailServiceImpl());
        return app;
    }

}
