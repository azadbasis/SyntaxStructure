package com.me.syntaxstructure.ManageProramFlow;

public class PassingPrimitiveValue {

    public static void passingPrimitiveValue() {
        int original=10;
        System.out.println("Original before: "+original);
        incrementValue(original);
        System.out.println("Original after: "+original);

        int[] originalArray={12,45,21};
        System.out.println("Original before: "+originalArray[0]);
        incrementArrayValue(originalArray);
        System.out.println("Original after: "+originalArray[0]);

        String originalString = "original";
        System.out.println("Original before: "+originalString);
        incrementStringValue(originalString);
        System.out.println("Original after: "+originalString);
    }

    private static void incrementStringValue(String inMethod) {
        inMethod="New!";
        System.out.println("In method: "+inMethod);
    }

    private static void incrementArrayValue(int[] inMethod) {
        inMethod[0]++;
        System.out.println("In method: "+inMethod[0]);
    }

    private static void incrementValue(int inMethod) {
//        inMethod++;
        ++inMethod;
        System.out.println(inMethod);
    }


}
