package com.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    @Autowired
    private static RedisTemplate redisTemplate;

    public static String put(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value, 24, TimeUnit.HOURS);
        } catch (Exception e) {
            return "fail";
        }
        return "success";
    }


}
