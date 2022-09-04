package com.test.string;

public class TestIndexOf {
    public static void main(String[] args) {
        String str1 = "/iapi/atn/AFPBARUC";
        int i = str1.indexOf("/",6);
        System.out.println(i);
        System.out.println("/iapi" + str1.substring(i));
    }
}
