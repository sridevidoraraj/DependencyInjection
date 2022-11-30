package com.example.dependencyinjection.demo.consumer;

import com.example.dependencyinjection.demo.service.MessageService;

public class Application implements Consumer{

    private MessageService service;

    public Application(MessageService svc){
        this.service=svc;
    }

    public Application(){}

    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec){

        this.service.sendMessage(msg, rec);

    }
}
