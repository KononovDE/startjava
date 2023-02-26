package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner =  new Scanner(System.in);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String expression = scanner.nextLine();

                double result = calculator.calculate(expression);
                if(result % 1 == 0) {
                    System.out.println("Результат: " + (int) result);
                } else {
                    System.out.println("Результат: " + result);
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}
