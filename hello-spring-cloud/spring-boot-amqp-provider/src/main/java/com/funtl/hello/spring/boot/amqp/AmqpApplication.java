package com.funtl.hello.spring.boot.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmqpApplication {
    public static void main(String[] args) {
        SpringApplication.run(AmqpApplication.class,args);
    }
}
