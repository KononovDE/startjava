package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double num1;
    private double num2;
    private double result;
    private char sign;

    public void split(String line) {
        String[] words = line.split(" ");
        num1 = Integer.parseInt(words[0]);
        sign = words[1].charAt(0);
        num2 = Integer.parseInt(words[2]);
    }

    public double calculate() {
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Математическая операция " + sign + " не поддерживается");
        }
        return result;
    }
}
