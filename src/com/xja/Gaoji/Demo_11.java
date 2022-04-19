package com.xja.Gaoji;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo_11 {
    public static void main(String[] args) {
        Collection<String> co = new ArrayList();
        co.add("zhangsan");
        co.add("wangwu");
        co.add("lisi");

       Iterator<String> it = co.iterator();
       while (it.hasNext()){
           String dd = it.next();
           System.out.println(dd);
       }

        }
    }
