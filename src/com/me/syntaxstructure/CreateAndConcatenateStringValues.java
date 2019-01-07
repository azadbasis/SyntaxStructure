package com.me.syntaxstructure;

public class CreateAndConcatenateStringValues {

    public static void createAndConcatenateStringValues() {

        String s1 = new String("This is  a String");
        String s2 = "This is a also string";
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        String s3 = new String(c);
        char[] c1=s3.toCharArray();
        String s = "Shirt size: ";
        String size = "M";
        String description=s+size;
        description+=", very elegant";
        String upercase=description.toUpperCase();
        char charAt=description.charAt(4);
        byte[] getBytes=description.getBytes();
        System.out.println(description);
        System.out.println(upercase);
        System.out.println(charAt);
        System.out.println(getBytes);


    }
}
