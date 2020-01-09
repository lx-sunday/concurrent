package com.schedule.timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author liaoxue
 * @ClassName: MyTask
 * @date 2019/11/14 10:15
 **/
public class MyTimer extends TimerTask {

    private Logger logger = LoggerFactory.getLogger(MyTimer.class);

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void run() {
        logger.info("{}=={}", Thread.currentThread().getName(), sdf.format(new Date()));
    }
}
