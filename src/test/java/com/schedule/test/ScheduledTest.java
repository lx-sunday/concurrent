package com.schedule.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author liaoxue
 * @ClassName: ScheduledTest
 * @Description:
 * @date 2019/11/13 11:30
 **/
public class ScheduledTest {


    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ScheduledTest.class);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(8);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                logger.info("{}=={}", Thread.currentThread().getName(), sdf.format(new Date()));
            }
        }, 1, 3, TimeUnit.SECONDS);
    }
}
