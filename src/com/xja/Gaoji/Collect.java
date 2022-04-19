package com.xja.Gaoji;

import java.util.ArrayList;
import java.util.Collection;

public class Collect {
    public static void main(String[] args) {

Collection co = new ArrayList<String>();
        co.add("张三");
        co.add("李四");
        co.add("王五");

//        System.out.println(co.contains("张三"));
        co.isEmpty();
       Object[] arr = co.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println(co);
    }
}