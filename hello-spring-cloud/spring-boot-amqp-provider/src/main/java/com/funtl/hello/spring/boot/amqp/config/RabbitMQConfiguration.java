package com.funtl.hello.spring.boot.amqp.config;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动化注入
 * 队列配置
 */
@Configuration
public class RabbitMQConfiguration {

    @Bean
    public Queue queue(){
        return new Queue("helloRabbit");
    }
}
