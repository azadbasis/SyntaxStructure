package com.me.syntaxstructure;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumericValuesAsStrings {


    public static void formatNumericValuesAsStrings() {


        double doubleValue = 1_234_567.89;
        NumberFormat numberFormat=NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

        NumberFormat intFormat=NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));

        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));

        Locale locale = new Locale("bn","BD");
//        Locale locale = new Locale("de","DE");
        NumberFormat localFormat=NumberFormat.getNumberInstance(locale);
        System.out.println(localFormat.format(doubleValue));

//        NumberFormat currencyFormat=NumberFormat.getCurrencyInstance();
//        System.out.println(currencyFormat.format(doubleValue));

        NumberFormat currencyFormat=NumberFormat.getCurrencyInstance(locale);
//        NumberFormat currencyFormat=NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormat.format(doubleValue));

//        DecimalFormat df=new DecimalFormat("$000.00");
        DecimalFormat df=new DecimalFormat("$##0.00#");
        System.out.println(df.format(1));
        System.out.println(df.format(5.891));
    }
}
