package com.me.syntaxstructure.ManageProramFlow;

import java.util.Scanner;

public class ReusableCodeWithMethods {


    private static String[] months = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"};

    public static void reusableCodeWithMethods(){
       // loopingMonth();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.print("Enter a month: ");
            String monthName=scanner.nextLine();
            if (monthName.length()==0) {
                break;
            }
            int monthNumber=getMonthNumber(monthName);
            if (monthNumber == -1) {
                System.out.println("Month not found!");
            } else {
                System.out.println(String.format("%s,is month number %d",monthName,monthNumber));
            }
        }
    }

    private static void loopingMonth() {
        for (int i = 0; i <months.length ; i++) {
            System.out.println(months[i]);
        }
    }
    private static int getMonthNumber(String month){
        for (int i = 0; i <months.length ; i++) {
            if (month.equalsIgnoreCase(months[i])) {
                return i;
            }
        }
        return -1;
    }
}
