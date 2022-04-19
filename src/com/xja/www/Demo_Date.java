package com.xja.www;

import java.util.ArrayList;
import java.util.Random;

public class Demo_Date {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 7; i++) {
            Random random = new Random();
            int temp = random.nextInt(32);
            list.add(temp);

        }
        System.out.println(list);

    }
}
