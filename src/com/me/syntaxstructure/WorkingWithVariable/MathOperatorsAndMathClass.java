package com.me.syntaxstructure.WorkingWithVariable;

public class MathOperatorsAndMathClass {

    public static void mathOperatorsAndMathClass() {
        int firstNumber = 56;
        int secondNumber = 42;
        int result1 = firstNumber + secondNumber;
        int result2 = firstNumber - secondNumber;
        int result3 = firstNumber * secondNumber;
        int result4 = firstNumber / secondNumber;
        double result5 = (double) firstNumber / (double) secondNumber;
        System.out.println("add " + result1 + " subtraction " + result2 + " multiplication " + result3 + " intDivided " + result4 + " longDivided " + result5);
        long rounded = Math.round(result5);
        int neg = -5;
        double absValue=Math.abs(neg);
        System.out.println("rounded "+rounded+" absValue "+absValue);

    }
}
