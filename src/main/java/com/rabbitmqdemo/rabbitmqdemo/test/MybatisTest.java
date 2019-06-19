package com.rabbitmqdemo.rabbitmqdemo.test;

import com.rabbitmqdemo.rabbitmqdemo.dao.MybatisTestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisTest {

    @Autowired
    MybatisTestMapper mybatisTestMapper;

    @Test
    public void insertUsernameTest() {
        mybatisTestMapper.insertUsername("王五");
    }
}
