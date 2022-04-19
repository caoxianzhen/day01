package com.xja.Gaoji;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Demo {
    public static void main(String[] args) {
        Collection<String> co = new ArrayList();
        co.add("张三");
        co.add("李四");
        co.add("王五");
        co.add("刘刘");
        Iterator<String> iterator  =  co.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
