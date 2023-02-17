package com.startjava.lesson_1.base;

public class IfElseStatementTheme {   
    public static void main(String[] args) {
        convertPseudocodeToJava();
        searchMaxMinNum();
        checkNum();
        searchEqualDigits();
        findSymbolByCode();
        calcDepositAmountAndPercent();
        calcGradesBySubjects();
        calcProfitForYear();
        calcNumberOfBanknotes();
    }

    private static void convertPseudocodeToJava() {
        System.out.println("1. Перевод псевдокода на язык Java ");
        
        int age = 25;
        if (age > 20) {
            System.out.println("Возраст выше максимального: " + age);
        } else {
            System.out.println("Возраст в допустимом диапазоне: " + age);
        }

        boolean male = true;
        if (!male) {
            System.out.println("Нет совпадения по полу: женский");
        } else {
            System.out.println("Есть совпадение по полу: мужской");
        }

       double height = 1.90;
        if (height < 1.80) {
            System.out.println("Рост ниже минимального: " + height);
        } else {
            System.out.println("Рост в допустимом диапазоне: " + height);
        }

        char capitalLetter = "Ivan".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Имя начинается на M");
        } else if (capitalLetter == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Нет известных совпадений по первой букве");
        }
    }

    private static void searchMaxMinNum() {
        System.out.println("\n2. Поиск max и min числа ");
        int num1 = 10;
        int num2 = 15;

        if (num1 > num2) {
            System.out.println("max: num1 = " + num1 + "\nmin: num2 = " + num2);
        } else if (num1 < num2) {
            System.out.println("max: num2 = " + num2 + "\nmin: num1 = " + num1);
        } else {
            System.out.println("num1 = num2 = " + num1);
        }
    }

    private static void checkNum() {
        System.out.println("\n3. Проверка числа ");
        int num = 10;

        if (num == 0) {
            System.out.println("Число является нулём");
        } else {
            if (num % 2 == 0) {
                System.out.println("Число чётное");
            } else {
                System.out.println("Число нечётное");
            }
            if (num > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
            System.out.println("Исходное число: " + num);
        }
    }

    private static void searchEqualDigits() {
        System.out.println("\n4. Поиск одинаковых цифр в числах ");
        int num1 = 113;
        int num2 = 123;
        System.out.println("Исходные числа:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        int ones1 = num1 % 10;
        int tens1 = num1 / 10 % 10;
        int hundreds1 = num1 / 100;

        int ones2 = num2 % 10;
        int tens2 = num2 / 10 % 10;
        int hundreds2 = num2 / 100;

        if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
            System.out.println("Равных цифр нет");
        } else {
            if (ones1 == ones2) {
                System.out.println("Число " + ones1 + " совпадает в нулевом разряде");
            } 
            if (tens1 == tens2) {
                System.out.println("Число " + tens1 + " совпадает в первом разряде");
            } 
            if (hundreds1 == hundreds2) {
                System.out.println("Число " + hundreds1 + " совпадает во втором разряде");
            } 
        }
    }

    private static void findSymbolByCode() {
        System.out.println("\n5. Определение символа по его коду ");
        char symb = '\u0057';
        System.out.println("Исходное число: " + symb);

        if (symb >= 'A' && symb <= 'Z') {
            System.out.println("Это большая буква");
        } else if (symb >= 'a' && symb <= 'z') {
            System.out.println("Это маленькая буква");
        } else if (symb >= '0' && symb <= '9') {
            System.out.println("Это число");
        } else {
            System.out.println("Это не буква и не число");
        }
    }

    private static void calcDepositAmountAndPercent() {
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком % ");
        double depositSumm = 300000;
        double accruedPercent = 0.1;

        if (depositSumm < 100000) {
            accruedPercent = depositSumm * 0.05;
        } else if (depositSumm >= 100000 && depositSumm <= 300000) {
            accruedPercent = depositSumm * 0.07;
        }
        double totalAmount = depositSumm + accruedPercent;

        System.out.println("Сумма вклада: " + depositSumm);
        System.out.println("Начисленный процент: " + accruedPercent);
        System.out.println("Итоговая сумма с %: " + totalAmount);
    }

    private static void calcGradesBySubjects() {
        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 5;
        int programmingGrade = 5;

        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent < 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent < 91) {
            historyGrade = 4;
        }

        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent < 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent < 91) {
            programmingGrade = 4;
        }

        double avrGrade = (double) (historyGrade + programmingGrade) / 2;
        double avrPercent = (double) (historyPercent + programmingPercent) / 2;

        System.out.println(historyGrade + " История");
        System.out.println(programmingGrade + " Программирование");
        System.out.println("Средний балл оценок по предметам: " + avrGrade);
        System.out.println("Средний % по предметам: " + avrPercent);
    }

    private static void calcProfitForYear() {
        System.out.println("\n8. Расчет прибыли за год");
        int rentMonth = 5000;
        int incomeMonth = 13000;
        int costPriceMonth = 9000;
        int profitYear = (incomeMonth - rentMonth - costPriceMonth) * 12;

        if (profitYear > 0) {
            System.out.println("Прибыль за год: +" + profitYear);
        } else {
            System.out.println("Прибыль за год: " + profitYear);
        }
    }

    private static void calcNumberOfBanknotes() {
        System.out.println("\n9. Подсчет количества банкнот");
        int sum = 567;
        System.out.println("Необходимо снять " + sum + " USD");

        int banknotes100Available = 10;
        int banknotes10Available = 5;
        int banknotes1Available = 50;

        int banknotes100Expected = sum / 100;
        int banknotes100Actual = banknotes100Available;
        if (banknotes100Expected <= banknotes100Available) {
            banknotes100Actual = banknotes100Expected; 
        }
        sum -= banknotes100Actual * 100;

        int banknotes10Expected = sum / 10;
        int banknotes10Actual = banknotes10Available;
        if (banknotes10Expected <= banknotes10Available) {
            banknotes10Actual = banknotes10Expected; 
        }
        sum -= banknotes10Actual * 10;

        int banknotes1Expected = sum;
        int banknotes1Actual = banknotes1Available;
        if (banknotes1Expected <= banknotes1Available) {
            banknotes1Actual = banknotes1Expected; 
        }

        System.out.println(banknotes100Actual + " банкнот номиналом 100");
        System.out.println(banknotes10Actual + " банкнот номиналом 10");
        System.out.println(banknotes1Actual + " банкнот номиналом 1");
        sum = banknotes100Actual * 100 + banknotes10Actual * 10 + banknotes1Actual;
        System.out.println("Выдаваемая сумма: " + sum);
    }
}