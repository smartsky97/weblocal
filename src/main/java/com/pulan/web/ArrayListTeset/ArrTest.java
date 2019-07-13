package com.pulan.web.ArrayListTeset;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class ArrTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        long t1 = System.currentTimeMillis();
        for (int i=0;i<200000;i++){
            map.put("hi"+i,"hello"+i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("时间差："+(t2-t1));
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(map.get("hi2"));

        new ChangeTest();

    }
}
