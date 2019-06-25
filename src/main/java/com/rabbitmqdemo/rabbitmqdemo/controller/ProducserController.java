/*
package com.rabbitmqdemo.rabbitmqdemo.controller;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@RestController
public class ProducserController {
*/
/*    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/send")
    public void SennerMsg(String msg) {
        System.err.println("输入的msg：" + msg);

        for (int i=0; i<=5;i++){
            amqpTemplate.convertAndSend("exchange", "a", msg);
        }


    }*//*


    @RequestMapping("/send")
    public void send() throws IOException, TimeoutException {
        // 1 创建一个ConnectionFactory, 并进行配置
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/");
        // 2 通过连接工厂创建连接
        Connection connection = connectionFactory.newConnection();
        // 3 通过connection创建一个Channel
        Channel channel = connection.createChannel();
        // 4 通过Channel发送数据
        for (int i = 0; i < 5; i++) {
            String msg = "Hello RabbitMQ！";
            // 1 exchange 2 routingKey
            channel.basicPublish("", "test001", null, msg.getBytes());
        }
        // 5 **关闭相关连接**
        channel.close();
        connection.close();
    }
}
*/
