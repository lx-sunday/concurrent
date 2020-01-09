package com.schedule.test;


import com.schedule.timer.MyTimer;

import java.util.Timer;

/**
 * @author liaoxue
 * @ClassName: MyTaskTest
 * @date 2019/11/14 10:18
 **/
public class MyTimerTest {

    public static void main(String[] args) {
        //创建定时器对象
        Timer t = new Timer();
        // t.schedule(new MyTimer(),5000);
        //3s后执行MyTask类中的run方法，后面每个10s执行一次
        t.schedule(new MyTimer(), 3000, 10000);

    }
}
