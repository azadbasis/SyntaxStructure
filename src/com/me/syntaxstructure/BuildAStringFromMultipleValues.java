package com.me.syntaxstructure;

import java.util.Scanner;

public class BuildAStringFromMultipleValues {

    public static void buildAStringFromMultipleValues() {
//        StringBuilder sb = new StringBuilder("Welcome");
//        sb.append(" Dhaka");
//        sb.toString();
//        String result = sb.toString();
//        System.out.println(result);

        StringBuilder b = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value 1: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter value 2: ");
        String input2 = scanner.nextLine();

        b.append(input1)
                .append(", ")
                .append(input2);

        System.out.println(b.toString());
    }
}
