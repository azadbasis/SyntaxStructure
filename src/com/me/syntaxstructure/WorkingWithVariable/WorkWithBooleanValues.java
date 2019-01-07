package com.me.syntaxstructure.WorkingWithVariable;

public class WorkWithBooleanValues {

    public static void workWithBooleanValues() {
        boolean b1 = false;
        boolean b2 = true;
        boolean b3;
        boolean reverse = !b1;
        System.out.println(b1+" "+b2+" "+reverse);
        int i=0;
        boolean b4=(i!=0);
        System.out.println(b4);
        String s="true";
        boolean b5=Boolean.parseBoolean(s);
        String s1 = "xyz";
        boolean b6=Boolean.parseBoolean(s1);
        System.out.println(b5+" "+b6);
    }


}
