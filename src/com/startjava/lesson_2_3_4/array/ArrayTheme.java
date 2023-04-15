package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverseArr();
        printMultiplication();
        deleteArrElements();
        printReversedArr();
        generateUniqueNums();
        copyFilledLines();
    }

    public static void reverseArr() {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {3, 1, 5, 7, 2, 6, 4};
        int lenght = intArr.length;
        System.out.println("Исходный порядок: ");
        print(intArr);

        for(int i = 0; i <= lenght / 2; i++) {
            int swap = intArr[i];
            intArr[i] = intArr[--lenght];
            intArr[lenght] = swap;
        }

        System.out.println("Обратный порядок: ");
        print(intArr);
    }

    private static void print(int[] intArr) {
        for (int num : intArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printMultiplication() {
        System.out.println("\n2. Вывод произведения элементов массива");
        int[] multipliedNums = new int[10];
        for (int i = 0; i < 10; i++) {
            multipliedNums[i] = i;
        }

        int index = 0;
        int result = 1;
        String text = "Не участвуют в произведении: ";
        for (int num : multipliedNums) {
            if ((num == 0)||(num == 9)) {
                text = text + num + "[" + index + "] ";
            } else {
                System.out.print(num + (num == multipliedNums[multipliedNums.length - 2] ? " = " : " * "));
                result *= num;
            }
            index++;
        }
        System.out.println(result);
        System.out.println(text);
    }

    public static void deleteArrElements() {
        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        int lenght = doubleArr.length;
        for (int i = 0; i < lenght; i++) {
            doubleArr[i] = Math.random();
        }

        System.out.println("Исходный массив:");
        int middleIndex = lenght / 2;
        print(doubleArr, middleIndex);
        System.out.println();

        int zeroedCells = 0;
        for (int i = 0; i < lenght; i++) {
            if (doubleArr[i] > doubleArr[middleIndex]) {
                doubleArr[i] = 0;
                zeroedCells++;
            }
        }

        System.out.println("Измененный массив:");
        print(doubleArr, middleIndex);
        System.out.println("\nКоличество обнуленных ячеек: " + zeroedCells);
    }

    private static void print(double[] doubleArr, int middleIndex) {
        int index = 0;
        for (double num : doubleArr) {
            System.out.printf(" %5.3f ", num);
            if (index++ == middleIndex) {
                System.out.println();
            }
        }
    }

    public static void printReversedArr() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet[c - 'A'] = c;
        }

        int lenght = alphabet.length - 1;
        for (int i = lenght; i >= 0; i--) {
            for (int j = lenght; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    public static void generateUniqueNums() {
        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqNums = new int[30];
        for (int i = 0; i < uniqNums.length; i++) {
            while (!isUniq(uniqNums, (int) (Math.random() * 40) + 60));
        }
        Arrays.sort(uniqNums);
        int index = 1;
        for (int num : uniqNums) {
            System.out.print(num + " ");
            if (index++ % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static boolean isUniq(int[] intArr, int num) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 0) {
                intArr[i] = num;
                return true;
            }
            if (intArr[i] == num) {
                return false;
            }
        }
        return true;
    }

    public static void copyFilledLines() {
        System.out.println("\n6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
//        Варианты тестирования:
//        String[] srcStrings = {"    ", ""};
//        String[] srcStrings = {"    ", "AA", "", "E", "FF", "G", ""};
//        String[] srcStrings = {"FF", "G", ""};

        int notBlankLines = 0;
        for (String line : srcStrings) {
            if (!line.isBlank()) {
                notBlankLines++;
            }
        }
        String[] destStrings = new String[notBlankLines];

        int sourcePos = 0;
        int destPos = 0;
        int length = 0;
        int index = 0;
        for (String line : srcStrings) {
            if (!line.isBlank()) {
                if (length == 0) {
                    sourcePos = index;
                }
                length++;
            } else if (length != 0) {
                System.arraycopy(srcStrings, sourcePos, destStrings, destPos, length);
                destPos += length;
                length = 0;
            }
            index++;
        }
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(srcStrings));
        System.out.println("Скопированный массив:");
        System.out.println(Arrays.toString(destStrings));
    }
}
