package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double num1;
    private double num2;
    private char sign;

    public double calculate(String expression) {
        split(expression);
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                return Math.pow(num1, num2);
            case '%':
                return num1 % num2;
            default:
                System.out.println("Математическая операция " + sign + " не поддерживается");
        }
        return 0;
    }

    private void split(String expression) {
        String[] partsExpression = expression.split(" ");
        num1 = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        num2 = Integer.parseInt(partsExpression[2]);
    }
}
