package com.me.syntaxstructure.WorkingWithVariable;

public class WorkWithCharacterValues {

    public static void workWithCharacterValues(){

        char c1='1';
        char c2='2';
        char c3='3';
        char nine='\u0024';
        char[] c4={'c','h','a','r','e','c','t','e','r'};
        String s=new String(c4);
        char[] c5=s.toCharArray();
        System.out.println("char "+c1+"\nunicode charecter "+nine+"\nstring value "+s);
        System.out.println(c5);
        char c6='a';
        char c7=Character.toUpperCase(c6);
        System.out.println(c7);

    }
}
