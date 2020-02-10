package com.cnu.mentoring.vineet.cdp.java8.HomeTask_1;

public class ThreadImplementation implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() +" - "+ i);
        }
    }
}
