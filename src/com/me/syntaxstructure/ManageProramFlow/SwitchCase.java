package com.me.syntaxstructure.ManageProramFlow;

public class SwitchCase {

    public static void switchCase() {

        int monthNumber = 1;

        switch (monthNumber) {

            case 0:
//                System.out.println("It's January!");
//                break;
            case 1:
//                System.out.println("It's February!");
//                break;
            case 2:
                System.out.println("It's March!");
                break;
                default:
                    System.out.println("It's some other month!");
        }
        String month="January";
        switch (month) {
            case "January":
                System.out.println("It's' first month!");
                break;
                default:
                    System.out.println("It's another month!");
        }
    }
}
