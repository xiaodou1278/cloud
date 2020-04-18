package com.pactera.buqa.coe.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

//接受RabbitMq的消息--消费者
@EnableBinding(value = {Sink.class,SinkSender.class})
@Slf4j
public class SinkReceiver {

    @StreamListener(Sink.INPUT)
    public void receive(Object obj){
        log.info("Received:"+obj);
    }

}
