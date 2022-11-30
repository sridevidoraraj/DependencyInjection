package com.example.dependencyinjection.demo.Test;

import com.example.dependencyinjection.demo.consumer.Application;
import com.example.dependencyinjection.demo.consumer.Consumer;
import com.example.dependencyinjection.demo.injector.MessageServiceInjector;
import com.example.dependencyinjection.demo.service.MessageService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DependencyInjectionTest {
    private MessageServiceInjector injector;
    @Before
    public void setUp(){

        injector = new MessageServiceInjector() {

            @Override
            public Consumer getConsumer() {

                return new Application(new MessageService() {

                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock Message Service implementation");

                    }
                });
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi", "sam@gmail.com");
        Assert.assertNotNull(consumer);


    }

    @After
    public void tear(){
        injector = null;
    }
}
