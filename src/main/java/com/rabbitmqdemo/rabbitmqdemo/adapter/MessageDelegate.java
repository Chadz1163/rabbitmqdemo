package com.rabbitmqdemo.rabbitmqdemo.adapter;

public class MessageDelegate {

    public void handleMessage(byte[] messageBody) {
        System.err.println("默认方法， 消息内容：" + new String(messageBody));
    }
}
