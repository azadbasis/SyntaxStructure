package com.me.syntaxstructure;

public class ParseStringValues {

    public static void parseStringValues() {

        String s="Welcome to Dhaka";
        int len=s.length();
        int pos = s.indexOf("Dhaka");
        String sub=s.substring(11);
        System.out.println("Length "+len+"\nPosition "+pos+"\nSubstring "+sub);
        String s1=" welcome!  ";
        String trim=s1.trim();
        System.out.println(s1+"\n"+trim);
        String s2="34.6";
        Double d1=Double.parseDouble(s2);
        double d2=Double.parseDouble(s2);
        System.out.println("Double: "+d1+"\ndouble: "+d2);
    }
}
