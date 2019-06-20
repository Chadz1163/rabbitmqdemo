package com.rabbitmqdemo.rabbitmqdemo.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducserController {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/send")
    public void SennerMsg(String msg) {
        System.err.println("输入的msg：" + msg);
        amqpTemplate.convertAndSend("exchange", "a", msg);

    }
}
