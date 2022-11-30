package com.example.dependencyinjection.demo.injector;

import com.example.dependencyinjection.demo.consumer.Application;
import com.example.dependencyinjection.demo.consumer.Consumer;
import com.example.dependencyinjection.demo.service.SmsServiceImpl;

public class SmsServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new Application(new SmsServiceImpl());
    }
}
