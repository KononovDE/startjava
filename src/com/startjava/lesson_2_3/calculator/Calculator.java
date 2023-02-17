package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private int result;
    private char sign;

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void calculate() {
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
                pow();
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Математическая операция " + sign + " не поддерживается");
        }
        System.out.println("Результат: " + num1 + " " + sign + " " + num2 + " = " + result);
    }

    private void pow() {
        result = num1;
        for(int i = 1; i < num2; i++) {
            result *= num1;
        }
    }
}