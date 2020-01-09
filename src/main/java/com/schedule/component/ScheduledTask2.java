package com.schedule.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;


/**
 * @author liaoxue
 * @ClassName: ScheduledTask1
 * @Description: 触发多线程定时任务
 * @date 2019/11/13 10:26
 **/
//@Component
public class ScheduledTask2 implements SchedulingConfigurer {

    private Logger logger = LoggerFactory.getLogger(ScheduledTask2.class);

    private int fixedDelayCount = 1;

    private int fixedRateCount = 1;

    private int initialDelayCount = 1;

    private int cronCount = 1;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {

        scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(10));
    }

    /**
     * fixedDelay = 5000表示当前方法执行完毕5000ms后
     *
     */
    @Scheduled(fixedDelay = 5000)
    public void testFixDelay() {

        logger.info("==testFixDelay:第{}次执行任务", fixedDelayCount++);
    }

    /**
     * fixedRate = 5000表示当前方法开始执行5000ms后
     * 固定频率执行
     */
    @Scheduled(fixedRate = 5000)
    public void testFixedRate() {

        logger.info("==testFixedRate:第{}次执行任务", fixedRateCount++);
    }

    /**
     * initialDelay = 1000表示延迟1000ms后执行
     */
    @Scheduled(initialDelay = 1000, fixedRate = 5000)
    public void testInitialDelay() {

        logger.info("==testInitialDelay:第{}次执行任务", initialDelayCount++);
    }

    /**
     * cron表达式定时触发
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void testCron() {

        logger.info("==testCron:第{}次执行任务", cronCount++);
    }

}
