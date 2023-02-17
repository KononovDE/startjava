package com.startjava.lesson_1.fin;

public class Calculator {

    private static int num1 = 10, num2 = 3, result;
    private static char sign = '%';

    public static void main(String[] args) {
        if (sign == '+') {
            addition();
        } else if (sign == '-') {
            subtraction();
        } else if (sign == '*') {
            multiplication();
        } else if (sign == '/') {
            division();
        } else if (sign == '^') {
            exponentiation();
        } else if (sign == '%') {
            moduloDivision();
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }

    private static void addition() {
        result = num1 + num2;
    }

    private static void subtraction() {
        result = num1 - num2;
    }

    private static void multiplication() {
        result = num1 * num2;
    }

    private static void division() {
        result = num1 / num2;
    }

    private static void exponentiation() {
        result = num1;
        for(int i = 1; i < num2; i++) {
            result *= num1;
        }
    }

    private static void moduloDivision() {
        result = num1 % num2;
    }
    
}