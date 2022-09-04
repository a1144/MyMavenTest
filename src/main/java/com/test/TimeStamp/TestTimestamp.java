package com.test.TimeStamp;

import java.sql.Timestamp;

public class TestTimestamp {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        System.out.println(l1);
        long l2 = l1/1000;
        System.out.println(l2);
        Timestamp t1 = new Timestamp(l1);
        Timestamp t2 = new Timestamp(l2);
        System.out.println(t1);
        System.out.println(t2);
    }
}
