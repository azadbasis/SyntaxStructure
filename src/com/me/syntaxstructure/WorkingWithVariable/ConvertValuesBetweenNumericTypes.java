package com.me.syntaxstructure.WorkingWithVariable;

public class ConvertValuesBetweenNumericTypes {

    public static void convertValuesBetweenNumericTypes(){

        short s=12;
        int i=s;
        long l=s;
        float f=s;
        double d=s;
        System.out.println("int "+i+" long "+l+" float "+f+" double "+d);
        short s1= (short) i;
        int i1=(int)f;
        System.out.println("short "+s1+" int "+i1);


    }
}
