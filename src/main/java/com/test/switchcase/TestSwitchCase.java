package com.test.switchcase;

public class TestSwitchCase {
    public static void main(String[] args) {
        String type = "a";

        switch (type) {
            case "a":
                System.out.println("a");
                return;
            case "b":
            case "B":
                System.out.println("b");
                return;

            default:
                System.out.println("default");
        }
        System.out.println("hello");


    }
}
