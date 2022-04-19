package com.xja.Gaoji;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Calendar;
import java.util.Date;

public class Demo_Calendar {
    public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();


    calendar.set(Calendar.YEAR,2023);
    int temp = calendar.get(Calendar.YEAR);


        Date data =calendar.getTime();
        System.out.println(data);

    }
}
