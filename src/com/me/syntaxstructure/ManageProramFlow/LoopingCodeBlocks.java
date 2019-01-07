package com.me.syntaxstructure.ManageProramFlow;

public class LoopingCodeBlocks {

    private static String[] months = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"};

    public static void loopingCodeBlocks() {

/*
1.An incrementing loop,
2.A for each loop,
3.A while loop,
4.A do while loop
 */
        for (int i = 0; i <months.length ; i++) {
            System.out.println(months[i]);
        }

//        for (String month :
//                months) {
//            System.out.println(month);
//        }

//        int counter=0;
//        while (counter<months.length) {
//            System.out.println(months[counter]);
//            counter++;
//        }
//        int counter = 0;
//        do {
//            System.out.println(months[counter]);
//            counter++;
//            if (counter == 5) {
//                break;
//            }
//        } while (counter < months.length);
    }
}
