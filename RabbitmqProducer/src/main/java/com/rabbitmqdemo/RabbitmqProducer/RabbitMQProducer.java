package com.rabbitmqdemo.RabbitmqProducer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQProducer {
     
    @Autowired
    private AmqpTemplate rabbitTemplate;
     
    @Value("${rabbitmq.exchange}")
    private String exchange;
     
    @Value("${rabbitmq.routingkey}")
    private String routingkey;  
     
    public void send(Employee emp) {
        rabbitTemplate.convertAndSend(exchange, routingkey, emp);
        System.out.println("Send msg = " + emp);
         
    }
}
