package com.example.dependencyinjection.demo.injector;

import com.example.dependencyinjection.demo.consumer.Consumer;

public interface MessageServiceInjector {

    Consumer getConsumer();
}
