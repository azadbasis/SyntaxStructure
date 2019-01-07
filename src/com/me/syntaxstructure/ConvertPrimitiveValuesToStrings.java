package com.me.syntaxstructure;

public class ConvertPrimitiveValuesToStrings {

    public static void convertPrimitiveValuesToStrings(){
        int no1=12;
        int no2=15;
        int result=no1+no2;
        String answer="The answer is "+result;
        String howMany=no1+" things";
        System.out.println("Answer: "+answer+"\nHowMany: "+howMany);

        String fromInt=Integer.toString(no1);
        long longValue=10_00_000;
        String fromLong=Long.toString(longValue);
        boolean boolValue=true;
        String fromBoolean=Boolean.toString(boolValue);
        String stringFormat=String.format("Size:%s,Qty:%d","M",no1);
        String stringFormat1=String.format("Size:%s,Size:%s,Qty:%d,Qty:%d","M","L",no1,no2);
        System.out.println(stringFormat);
        System.out.println(stringFormat1);

    }
}
