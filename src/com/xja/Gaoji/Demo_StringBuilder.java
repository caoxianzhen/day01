package com.xja.Gaoji;

public class Demo_StringBuilder {
    public static void main(String[] args) {


//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuilder str2 = new StringBuilder("abc");
////        System.out.println(str2);
//        str2.append("dddd");
//        System.out.println(str2);
//        System.out.println(str2.toString());
        String str = "abcdefg";
        String str1 = "hijklmn";
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder stringBuilder2 = new StringBuilder(str1);
       stringBuilder.append(stringBuilder2);
        System.out.println(stringBuilder);




    }
}