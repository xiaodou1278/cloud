package com.pactera.buqa.coe.stream;



import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
//消息生产者
public interface SinkSender {

    @Output(Sink.INPUT)
    MessageChannel output();
}
