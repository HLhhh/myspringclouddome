package com.funtl.hello.spring.boot.amqp.consumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RabbitListener(queues = "helloRabbit")
public class HelloRabbitConsumer extends Thread {
//    @RabbitHandler
//    public void process(String message) throws InterruptedException {
//        Thread.sleep(200);
//        System.out.println("Consumer: " + message);
//    }


    @RabbitHandler
    public void processMessage2(String message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) {
        //System.out.println(message);
        try {
            channel.basicAck(tag,false);
            Thread.sleep(200);
            System.out.println("Consumer: " + message);
            // 确认消息
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
