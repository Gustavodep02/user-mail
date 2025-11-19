package com.gustavo.email.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQ {

    private final String queueName = "email-queue";
    public Queue queue(){
        return new Queue(queueName, true);
    }
}
