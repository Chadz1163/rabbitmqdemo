package com.rabbitmqdemo.rabbitmqdemo.test.quickstart;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Produser {

    public static void main(String[] arg) throws IOException, TimeoutException {
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
