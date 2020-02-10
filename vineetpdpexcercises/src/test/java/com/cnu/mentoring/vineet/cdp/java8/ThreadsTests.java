package com.cnu.mentoring.vineet.cdp.java8;

import com.cnu.mentoring.vineet.cdp.java8.HomeTask_1.ThreadImplementation;
import org.testng.annotations.Test;

public class ThreadsTests {

    @Test
    public void testThreadNumbers(){
        Thread thread = new Thread(new ThreadImplementation());
        thread.start();

        Runnable printNumbers = () -> {
            for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName() +" - "+ i);
            }
        };
        thread = new Thread(printNumbers);
        thread.start();
    }
}
