package com.rabbitmqdemo.rabbitmqdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MybatisTestMapper {

    void insertUsername(@Param("username") String username);
}
