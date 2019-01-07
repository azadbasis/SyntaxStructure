package com.me.syntaxstructure.WorkingWithVariable;

import java.math.BigInteger;

public class DeclareModifyPrimitive {
    public static void getDeclareModifyPrimitiveValue(){
        System.out.println("===Declare and modify primitive values==");

        char c = 'a';
        System.out.println("Character.MAX_VALUE " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE " + Character.MIN_VALUE);
        System.out.println("Character.BYTES " + Character.BYTES);
        System.out.println("Character.SIZE " + Character.SIZE);


        byte b = 127;
        b = -127;
        System.out.println(b);
        System.out.println("Byte.MAX_VALUE " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE " + Byte.MIN_VALUE);
        System.out.println("Byte.BYTES " + Byte.BYTES);
        System.out.println("Byte.SIZE " + Byte.SIZE);
        int i = 2147483647;
        System.out.println(i);
        System.out.println("Integer.MAX_VALUE " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE " + Integer.MIN_VALUE);
        System.out.println("Integer.BYTES " + Integer.BYTES);
        System.out.println("Integer.SIZE " + Integer.SIZE);

        BigInteger b1 = new BigInteger("64248348234832437463274");
        BigInteger b2 = new BigInteger("44357643573473456343784358734");
        BigInteger b3 = b1.multiply(b2);
        System.out.println("BigInteger " + b3);
        long k = 2147483648L;
        System.out.println("Long.MAX_VALUE " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE " + Long.MIN_VALUE);
        System.out.println("Long.BYTES " + Long.BYTES);
        System.out.println("Long.SIZE " + Long.SIZE);
        short s = 32767;
        System.out.println("short " + s);
        System.out.println("Short.MAX_VALUE " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE " + Short.MIN_VALUE);
        System.out.println("Short.Bytes " + Short.BYTES);
        System.out.println("Short.Size " + Short.SIZE);
        float f = 3.4028235E38f;
        System.out.println("float " + f);
        System.out.println("Float.MAX_VALUE " + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE " + Float.MIN_VALUE);
        System.out.println("Float bytes " + Float.BYTES);
        System.out.println("Float Size " + Float.SIZE);
        double d = 56565546.78987687689;
        System.out.println("Double.MAX_VALUE " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE " + Double.MIN_VALUE);
        System.out.println("Double.SIZE " + Double.SIZE);
        System.out.println("Double.BYTES " + Double.BYTES);

        int hg = 0;
        short jh = 0;
        double db = 10.8;

        System.out.println(db);
    }
}
