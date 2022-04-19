package com.xja.Gaoji;

import java.util.Arrays;

public class Demo_Array {
    public static void main(String[] args) {
         int []arr = {22,33,455,3433,22332};
         int [] temp = {4,4,5,2,33,2,333};
        System.out.println(Arrays.toString(temp));

        System.arraycopy(arr,0,temp,0,3);
        System.out.println(Arrays.toString(temp));


    }
}
