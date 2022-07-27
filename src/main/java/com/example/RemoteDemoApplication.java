package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class RemoteDemoApplication {

    public static void main(String[] args) {
        log.info("hello,i am one");
        log.info("hello,i am two");
        log.info("hello,i am three");
        log.info("hello,i am four");
        log.info("os.name = {}", System.getProperty("os.name"));
        log.info("os.version = {}", System.getProperty("os.version"));
        log.info("os.arch = {}", System.getProperty("os.arch"));
        log.info("system.name = {}", System.getProperty("user.name"));
        log.info("system.home = {}", System.getProperty("user.home"));

        SpringApplication.run(RemoteDemoApplication.class, args);
    }

}
