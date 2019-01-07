package com.me.syntaxstructure;

public class CompareStringValuesWithMethods {

    public static void compareStringValuesWithMethods() {
        String s1 = "Hello!";
        String s2 = "Hello!";
        if (s1 == s2) {
            System.out.println("They are match!");
        } else {
            System.out.println("They are not match!");
        }
        String s3 = new String("Hello!");
        String s4 = new String("HELLO!");
        if (s3 == s4) {
            System.out.println("They are match!");
        } else {
            System.out.println("They are not match!");
        }
        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("They are match!");
        } else {
            System.out.println("They are not match!");
        }
    }
}
