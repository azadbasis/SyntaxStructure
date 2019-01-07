package com.me.syntaxstructure.WorkingWithVariable;

import java.math.BigDecimal;

public class StoreCurrencyValuesBigDecimal {

    public static void storeCurrencyValuesBigDecimal(){
        double value=0.012;
        double pSum=value+value+value;
        System.out.println("pSum "+pSum+","+"Oh! it is an Odd result");
        String stringValue=Double.toString(value);
        BigDecimal bigDecimal=new BigDecimal(stringValue);
        BigDecimal bSum=bigDecimal.add(bigDecimal).add(bigDecimal);
        System.out.println("bSum "+bSum);
        double sum=bSum.doubleValue();
        System.out.println("sum "+sum);
    }

}
