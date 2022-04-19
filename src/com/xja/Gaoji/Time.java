package com.xja.Gaoji;

public class Time {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {//循环1000次

            System.out.println(i);
        }
       long end =  System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
