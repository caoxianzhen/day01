package com.xja.Gaoji;

public class Integer_Demo {
    public static void main(String[] args) {
        int da = 100;
        String str = 100 + "";
//        System.out.println(str + 200);
        String s = Integer.toString(100);
        String s1 = String.valueOf(100);
//        System.out.println(s + s1);
        int i = Integer.parseInt(s1);
        byte b = Byte.parseByte(s1);
        System.out.println(b);
        System.out.println(i);
    }
}
