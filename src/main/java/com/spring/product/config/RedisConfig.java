package com.spring.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {
    private RedisConnectionFactory redisConnectionFactory = null;

    @Bean(name = "RedisConnectionFactory")
    public RedisConnectionFactory initRedisConnectionFactory(){
        if(this.redisConnectionFactory != null){
            return this.redisConnectionFactory;
        }
        JedisPoolConfig poolConfig = new JedisPoolConfig();
//        poolConfig.setMaxIdle(30);  // 最大空闲数
//        poolConfig.setMaxTotal(50); // 最大连接数
//        poolConfig.setMaxWaitMillis(2000);  // 最大等待毫秒
        // 创建Jedis连接工厂
        JedisConnectionFactory connectionFactory = new JedisConnectionFactory(poolConfig);
        // 获取单机的Redis配置
//        RedisStandaloneConfiguration rsCfg = connectionFactory.getStandaloneConfiguration();
//        rsCfg.setHostName("127.0.0.1");
//        rsCfg.setPort(6379);
//        rsCfg.setPassword("123456");
        this.redisConnectionFactory = connectionFactory;
        return redisConnectionFactory;
    }

    @Bean(name = "redisTemplate")
    public RedisTemplate<Object,Object> initRedisTemplate(){
        RedisTemplate<Object,Object> redisTemplate = new RedisTemplate<Object, Object>();
        RedisSerializer stringRedisSerializer = redisTemplate.getStringSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setValueSerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        redisTemplate.setHashValueSerializer(stringRedisSerializer);
        redisTemplate.setConnectionFactory(initRedisConnectionFactory());
        return redisTemplate;
    }
}
