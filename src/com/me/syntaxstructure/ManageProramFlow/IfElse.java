package com.me.syntaxstructure.ManageProramFlow;

public class IfElse {

    public static void evaluateConditionsWithIf_Else() {
        int monthNumber = 4;
        if (monthNumber == 0 && monthNumber <= 2) {
            System.out.println("It's is january");
        } else if (monthNumber >= 2 && monthNumber <= 6) {
            System.out.println("It is Quarter");
        } else {
            System.out.println("It's not january");
        }
    }
}
