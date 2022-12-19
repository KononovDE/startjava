public class CyclesTheme {   
    public static void main(String[] args) {
        calcEvenAndOdd();
        orderNumsInMinMaxInterval();
        findReversibleNumAndDigitsSum();
        displayNumsInMultipleLines();
        checkIsNumOfTwosEven();
        drawFigures();
        displayAsciiChar();
        checkIsNumPalindrom();
        checkIsNumLucky();
        drawPythagoreanMultTable();
    }

    private static void calcEvenAndOdd() {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);
    }

    private static void orderNumsInMinMaxInterval() {
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num3;
        int min = num3;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        }

        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        }

        System.out.print("Числа в интервале от " + min + " до " + max + ": ");
        for(int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void findReversibleNumAndDigitsSum() {
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        
        int num = 1234;
        int sum = 0;

        System.out.print("Реверсивное число: ");
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            System.out.print( digit);
            num /= 10;
        }
        System.out.println("\nСумма цифр: " + sum);
    }

    private static void displayNumsInMultipleLines() {
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int countNums = 0;
        int max = 24;

        for(int i = 1; i < max; i += 2) {
            System.out.printf("%2s ", i);
            if (++countNums == 5) {
                countNums = 0;
                System.out.println();
            }
        }
        if (countNums > 0) {
            for(; countNums < 5; countNums++) {
                System.out.printf("%2s ", 0);
            }
        }

    }

    private static void checkIsNumOfTwosEven() {
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        
        int num = 3242592;
        System.out.print("Число " + num);
        int numTwos = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit == 2) {
                numTwos++;
            }
            num /= 10;
        }
        if (numTwos % 2 == 0) {
            System.out.print(" содержит " + numTwos +" (четное) количество двоек");
        } else {
            System.out.print(" содержит " + numTwos +" (нечетное) количество двоек");
        }
    }

    private static void drawFigures() {
        System.out.println("\n\n6. Отображение фигур в консоли");
        
        int newLineCounter = 0;
        int symbNum = 0;

        System.out.println("\nПрямоугольник:");
        for(symbNum = 1; symbNum <= 50; symbNum++) {
            System.out.print("*");
            if (++newLineCounter == 10) {
                newLineCounter = 0;
                System.out.println();
            }
        }

        System.out.println("\nПрямоугольный треугольник:");
        symbNum = 1;
        int newLineBorder = 5;
        while (symbNum <= 15) {
            System.out.print("#");
            if (++newLineCounter == newLineBorder) {
                newLineCounter = 0;
                newLineBorder--;
                System.out.println();
            }
            symbNum++;
        }

        System.out.println("\nВторой треугольник:");
        symbNum = 1;
        newLineBorder = 1;
        newLineCounter = 0;
        do {
            System.out.print("$");
            if (++newLineCounter == newLineBorder) {
                newLineCounter = 0;
                System.out.println();
                if (newLineBorder < 3) {
                    newLineBorder++;
                } else {
                    newLineBorder--;
                }
            }
            symbNum++;
        } while (symbNum <= 9);
    }

    private static void displayAsciiChar() {
        System.out.println("\n\n7. Отображение ASCII-символов");
        
        int newLineCounter = 0;
        int i;
        System.out.print("\nCимволы, идущие до цифр и имеющие нечетные коды");
        for(i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                if (i == 7) {
                    System.out.printf("\n%8c %9s", i,  i);
                } else if (i == 9) {
                    System.out.printf("\n%8c %8s", i,  i);
                } else if (i == 13) {
                    System.out.printf("\n%8c %16s", i,  i);
                } else {
                    System.out.printf("\n%8c %8s", i,  i);
                }
            }
        }
        System.out.print("\nМаленькие английские буквы, имеющие четные коды");
        for(i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("\n%8c %8s", i,  i);
            }
        }
    }

    private static void checkIsNumPalindrom() {
        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        int num = 1234321;
        int digit, sum = 0;
        
        System.out.print("Число " + num);
        
        int copyNum = num;
        while (num > 0) {
            digit = num % 10;
            sum = (sum * 10) + digit;
            num /= 10;
        }
        if (copyNum == sum) {
            System.out.println(" является палиндромом");
        } else {
            System.out.println(" не является палиндромом");
        }
    }

    private static void checkIsNumLucky() {
        System.out.println("\n9. Определение, является ли число счастливым");
        int num = 123321;
        int part1 = num / 1000;
        int part2 = num % 1000;;
        int currentCharNum = 0;
        int digit = 0;

        int sum1 = 0, sum2 = 0;

        while (num != 0) {
            digit = num % 10;
            num /= 10;
            currentCharNum++;
            if (currentCharNum <= 3) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }
        }
        
        if (currentCharNum == 6) {
            System.out.println("Число шестизначное");
        } else {
            System.out.println("Число не шестизначное");
        }
        
        System.out.println("Сумма цифр " + part1 + " = " + sum1);
        System.out.println("Сумма цифр " + part2 + " = " + sum2);
        
        if (sum1 == sum2) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не счастливое");
        }
    }

    private static void drawPythagoreanMultTable(){
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for(int i = 1; i <=9; i++) 
        {
            if (i == 2) {
                System.out.println("___|________________________");
            }
            for(int j = 1; j <=9; j++) {
                if (i * j == 1) {
                    System.out.printf("   ");
                } else {
                    System.out.printf("%2d ", i * j);
                }
                if (j == 1) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
    }
}
