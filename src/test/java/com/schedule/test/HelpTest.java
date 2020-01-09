package com.schedule.test;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author liaoxue
 * @ClassName: HelpTest
 * @date 2019/11/18 10:50
 **/
public class HelpTest {

    private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Test
    public void test1(){
        int k=8;
        System.out.println("k>>1--"+(k>>1));
        System.out.println("k<<1--"+(k<<1));
    }

    @Test
    public void testDuring() throws Exception {
        Date parse = df.parse("2019-11-18 10:59:59");
        Calendar calendar = Calendar.getInstance();
        long currentTime, executionTime;
        currentTime = System.currentTimeMillis();
        calendar.setTime(parse);
        executionTime = calendar.getTimeInMillis();

        long during = executionTime - currentTime;
        System.out.println("第一次时间：" + during);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        during = executionTime - currentTime;
        System.out.println("第二次时间：" + during);
    }
}
