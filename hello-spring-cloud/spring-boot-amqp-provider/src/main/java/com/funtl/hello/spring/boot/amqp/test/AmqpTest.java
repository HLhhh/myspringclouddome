package com.funtl.hello.spring.boot.amqp.test;

import com.funtl.hello.spring.boot.amqp.AmqpApplication;
import com.funtl.hello.spring.boot.amqp.provider.HelloRabbitProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AmqpApplication.class)
public class AmqpTest {
    @Autowired
    private HelloRabbitProvider helloRabbitProvider;

    @Test
    public void testSender() {
        for (int i = 0; i < 1000; i++) {
            helloRabbitProvider.send();
        }
    }
}
