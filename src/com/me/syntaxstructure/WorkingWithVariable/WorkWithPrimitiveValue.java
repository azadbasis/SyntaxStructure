package com.me.syntaxstructure.WorkingWithVariable;

public class WorkWithPrimitiveValue {

    public static void workWithPrimitiveValue(){
        System.out.println("===work with primitive value==");
        String doubleValue = "156.5";
        Double doubleObject = Double.parseDouble(doubleValue);
        byte byteValue = doubleObject.byteValue();
        int intValue = doubleObject.intValue();
        float floatValue = doubleObject.floatValue();
        String stringValue = doubleObject.toString();
        System.out.println("Double " + doubleObject + "\n" + "byte " + byteValue + "\n" + "intValue " + intValue +
                "\n" + "floatValue " + floatValue + "\n" + "StringValue " + stringValue);
        String integerValue = "233";
        Integer integerObject = Integer.parseInt(integerValue);
        double bv = integerObject.doubleValue();
        System.out.println(integerObject);
        System.out.println(bv);
        int n = Integer.parseInt(integerValue);
        double dvn = n;
        double ss = integerObject;
        System.out.println(dvn);
        System.out.println(ss);
    }
}
