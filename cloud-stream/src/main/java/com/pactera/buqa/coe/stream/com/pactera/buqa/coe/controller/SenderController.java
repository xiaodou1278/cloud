package com.pactera.buqa.coe.stream.com.pactera.buqa.coe.controller;

import com.pactera.buqa.coe.stream.SinkSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {
    @Autowired
    SinkSender sinkSender;

    @RequestMapping(value = "/sendMsg",method = RequestMethod.POST)
    public void sendMessage(String  msg){
        sinkSender.output().send(MessageBuilder.withPayload(msg).build());
    }
}
