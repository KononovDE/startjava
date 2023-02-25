package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        arrayReverse();
    }

    private static void arrayReverse() {
        System.out.println("1. Реверс значений массива");
        int maxLenght = 3;
        int[] numbers = {3, 1, 5, 7};
        System.out.println("Исходный порядок: ");
        for(int i = 0; i <= maxLenght; i++) {
            System.out.println(numbers[i]);
        }

        for(int i = 0; i <= maxLenght / 2; i++) {
            int swap = numbers[i];
            numbers[i] = numbers[maxLenght - i];
            numbers[maxLenght - i] = swap;
        }
        System.out.println("Обратный порядок: ");
        for(int i = 0; i <= maxLenght; i++) {
            System.out.println(numbers[i]);
        }
    }
}
