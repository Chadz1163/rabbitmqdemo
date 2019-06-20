package com.rabbitmqdemo.rabbitmqdemo.controller;

import com.rabbitmqdemo.rabbitmqdemo.config.MyWebSocketHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;

@RestController
public class ConsumerController {
    @Autowired
    public MyWebSocketHandler handler;

    @RabbitListener(queues = "queue")
    public void Recive(String msg) throws Exception{
        System.out.println("接收到的msg：" + msg);
        handler.sendMsgToJsp(new TextMessage(msg), "A");
    }

}
