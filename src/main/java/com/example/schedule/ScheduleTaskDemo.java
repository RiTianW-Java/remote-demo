package com.example.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
@EnableScheduling
public class ScheduleTaskDemo {

    @Scheduled(cron = "*/3 * * * * ?")
    public void scheduleTaskDemo() {
        log.info("当前时间为：{}",new SimpleDateFormat("yyyy-MM-dd dd:mm:ss").format(new Date()));
    }
}
