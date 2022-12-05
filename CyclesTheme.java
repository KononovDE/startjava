public class CyclesTheme {   
    public static void main(String[] args) {
        calcEvenAndOdd();
        orderNumbersInMinMaxInterval();
        findReversibleNumberAndDigitsSum();
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
        
        int num = -10;
        int sumEven = 0;
        int sumOdd = 0;
        
        do {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            num++;
        } while (num <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
            ", а нечетных = " + sumOdd);
    }

    private static void orderNumbersInMinMaxInterval() {
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;

        if (num1 >= num2 && num1 >= num3) {
            max = num1; 
        } else if (num1 <= num2 && num1 <= num3) {
            min = num1; 
        }
        if (num2 >= num1 && num2 >= num3) {
            max = num2; 
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2; 
        }
        if (num3 >= num1 && num3 >= num2) {
            max = num3; 
        } else if (num3 <= num1 && num3 <= num2) {
            min = num3; 
        }

        System.out.print("Числа в интервале от " + min + " до " + max + ": ");
        for(int i = min + 1; i < max; i++) {
            System.out.print( i + " ");
        }
        System.out.println();
    }

    private static void findReversibleNumberAndDigitsSum() {
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        
        int num = 1234;
        int sum = 0;
        int digit;

        System.out.print("Реверсивное число: ");
        while (num != 0) {
            digit = num % 10;
            sum += digit;
            System.out.print( digit);
            num /= 10;
        }
        System.out.println("\nСумма цифр: " + sum);
    }

    private static void displayNumsInMultipleLines() {
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        
        int newLineCounter = 0;
        int zero = 0;

        for(int i = 1; i < 24; i += 2) {
            System.out.printf("%2s ", i);
            if (++newLineCounter == 5) {
                newLineCounter = 0;
                System.out.println();
            }
        }

        while (newLineCounter != 0 && newLineCounter != 5) {
            ++newLineCounter;
            System.out.printf("%2s ", zero);
        }
    }

    private static void checkIsNumOfTwosEven() {
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        
        int num = 3242592;
        System.out.print("Число " + num);
        int currentChar;
        int currentCharNum = 7;
        int twosNum = 0;

        while (currentCharNum != 0) {
            currentChar = num % 10;
            if (currentChar == 2) {
                twosNum++;
            }
            num /= 10;
            currentCharNum--;
        }
        if (twosNum % 2 == 0) {
            System.out.print(" содержит " + twosNum +" (четное) количество двоек");
        } else {
            System.out.print(" содержит " + twosNum +" (нечетное) количество двоек");
        }
    }

    private static void drawFigures() {
        System.out.println("\n\n6. Отображение фигур в консоли");
        
        int newLineCounter = 0;
        int i = 0;

        System.out.println("\nПрямоугольник:");
        for(i = 1; i <= 50; i++) {
            System.out.print("*");
            if (++newLineCounter == 10) {
                newLineCounter = 0;
                System.out.println();
            }
        }

        System.out.println("\nПрямоугольный треугольник:");
        i = 1;
        int newLineBorder = 5;
        while (i <= 15) {
            System.out.print("#");
            if (++newLineCounter == newLineBorder) {
                newLineCounter = 0;
                newLineBorder--;
                System.out.println();
            }
            i++;
        }

        System.out.println("\nВторой треугольник:");
        i = 1;
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
            i++;
        } while (i <= 9);
    }

    private static void displayAsciiChar() {
        System.out.println("\n\n7. Отображение ASCII-символов");
        
        int newLineCounter = 0;
        int i;
        System.out.print("\nCимволы, идущие до цифр и имеющие нечетные коды");
        for(i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("\n%4s %4s", (char) i,  i);
            }
        }
        System.out.print("\nМаленькие английские буквы, имеющие четные коды");
        for(i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("\n%4s %4s", (char) i,  i);
            }
        }
    }

    private static void checkIsNumPalindrom() {
        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        int num = 1234321;
        int remainder, sum = 0, temp;
        
        System.out.print("Число " + num);
        
        temp = num;
        while (num > 0) {
            remainder = num % 10;
            sum = (sum * 10) + remainder;
            num /= 10;
        }
        if (temp == sum) {
            System.out.println(" является палиндромом");
        } else {
            System.out.println(" не является палиндромом");
        }
    }

    private static void checkIsNumLucky() {
        System.out.println("\n9. Определение, является ли число счастливым");
        int num = 123321;
        int digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0, digit5 = 0, digit6 = 0;
        int currentCharNum = 0;
        int currentChar = 0;

        int sum1 = 0, sum2 = 0;

        while (num != 0) {
            currentChar = num % 10;
            num /= 10;
            currentCharNum++;
            if (currentCharNum <= 3) {
                sum1 += currentChar;
                if (currentCharNum == 1) {
                    digit1 = currentCharNum;
                }
                if (currentCharNum == 2) {
                    digit2 = currentCharNum;
                }
                if (currentCharNum == 3) {
                    digit3 = currentCharNum;
                }
            } else {
                if (currentCharNum == 4) {
                    digit4 = currentCharNum;
                }
                if (currentCharNum == 5) {
                    digit5 = currentCharNum;
                }
                if (currentCharNum == 6) {
                    digit6 = currentCharNum;
                }
                sum2 += currentChar;
            }
        }
        if (currentCharNum == 6) {
            System.out.println("Число шестизначное");
        } else {
            System.out.println("Число не шестизначное");
        }
        System.out.println("Сумма цифр " + digit1 + digit2 + digit3 + " = " + sum1);
        System.out.println("Сумма цифр " + digit4 + digit5 + digit6 + " = " + sum2);
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
