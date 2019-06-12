package com.funtl.hello.spring.boot.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AmqpConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AmqpConsumerApplication.class,args);
    }
}
