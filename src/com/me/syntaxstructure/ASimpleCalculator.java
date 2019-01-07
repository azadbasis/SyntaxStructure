package com.me.syntaxstructure;

import java.util.Scanner;

public class ASimpleCalculator {

    public static void aSimpleCalculator(){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        String input1=scanner.nextLine();
        double d1=Double.parseDouble(input1);

        System.out.print("Enter a numeric value: ");
        String input2=scanner.nextLine();
        double d2=Double.parseDouble(input2);

        double result=d1+d2;

        System.out.println("Output: "+result);
    }
}
