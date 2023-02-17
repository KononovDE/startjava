package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner =  new Scanner(System.in);
        String answer = "";

        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            calculator.setNum1(num1);

            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            calculator.setSign(sign);

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            calculator.setNum2(num2);
            scanner.nextLine();// Чтобы не пропускал ввод окончания цикла

            calculator.calculate();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}