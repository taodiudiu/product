package com.spring.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate = null;

    @RequestMapping("/setValue/{key}/{value}")
    public String SetRedisValue(@PathVariable String key,@PathVariable String value){
        redisTemplate.opsForValue().set(key,value);
        return "Set OK!";
    }

    @RequestMapping("/getValue/{key}")
    public String GetRedisValue(@PathVariable String key){
        return (String) redisTemplate.opsForValue().get(key);
    }
}
