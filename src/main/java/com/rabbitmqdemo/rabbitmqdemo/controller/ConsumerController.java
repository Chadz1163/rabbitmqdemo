/*
package com.rabbitmqdemo.rabbitmqdemo.controller;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@RestController
public class ConsumerController {
*/
/*    @Autowired
    public MyWebSocketHandler handler;

    @RabbitListener(queues = "queue")
    public void Recive(String msg) throws Exception{
        System.out.println("接收到的msg：" + msg);
        handler.sendMsgToJsp(new TextMessage(msg), "A");

    }*//*

    @RequestMapping("/get")
    public String get() throws IOException, TimeoutException, InterruptedException {
        // 1 创建一个ConnectionFactory, 并进行配置
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/");
        // 2 通过连接工厂创建连接
        Connection connection = connectionFactory.newConnection();

        // 3 通过connection创建一个Channel
        Channel channel = connection.createChannel();

        // 4 声明（创建）一个队列
        // channel.queueDeclare(queue, durable, exclusive, autoDelete, arguments);
        String queueName = "test001";
        channel.queueDeclare(queueName, true, false, false, null);

        // 5 创建消费者
        QueueingConsumer queueingConsumer = new QueueingConsumer(channel);

        // 6 设置Channel
        channel.basicConsume(queueName, true, queueingConsumer);
        while (true) {
            // 7 获取消息
            QueueingConsumer.Delivery delivery = queueingConsumer.nextDelivery();
            String msg = new String(delivery.getBody());
            System.err.println("消费者：" + msg);
//            Envelope envelope = delivery.getEnvelope();
        }

    }


}
*/
