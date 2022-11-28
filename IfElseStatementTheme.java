public class IfElseStatementTheme {   
    public static void main(String[] args) {
        convertPseudocodeToJava();
        searchMaxMinNum();
        checkNum();
        searchEqualDigits();
        getSymbolByCode();
        calcDepositAmountAndPercent();
        getGradesBySubjects();
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

        String name = "Ivan";
        char firstCharName = name.charAt(0);
        switch (firstCharName) {
            case 'M':
                System.out.println("Имя начинается на M: " + name);
                break;
            case 'I':
                System.out.println("Имя начинается на I: " + name);
                break;
            default:
                System.out.println("Нет известных совпадений по первой букве: " + name);
        }
    }

    private static void searchMaxMinNum() {
        System.out.println("\n2. Поиск max и min числа ");
        int num1 = 10;
        int num2 = 15;

        if (num1 > num2) {
            System.out.println("max: num1 = " + num1);
            System.out.println("min: num2 = " + num2);
        } else if (num1 < num2) {
            System.out.println("max: num2 = " + num2);
            System.out.println("min: num1 = " + num1);
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

    private static void getSymbolByCode() {
        System.out.println("\n5. Определение символа по его коду ");
        char symb = '\u0057';
        System.out.println("Исходное число: " + symb);

        if (symb >= 'A' && symb <= 'Z') {
            System.out.println("Это большая буква");
        } else if (symb >= 'a' && symb <= 'z') {
            System.out.println("Это маленькая буква");
        } else if (symb >= 0 && symb <= 9) {
            System.out.println("Это число");
        } else {
            System.out.println("Это не буква и не число");
        }
    }

    private static void calcDepositAmountAndPercent() {
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком % ");
        double depositSumm = 300000;
        double accruedPercent;

        if (depositSumm < 100000) {
            accruedPercent = depositSumm * 0.05;
        } else if (depositSumm >= 100000 && depositSumm <= 300000) {
            accruedPercent = depositSumm * 0.07;
        } else {
            accruedPercent = depositSumm * 0.1;
        }
        double totalAmount = depositSumm + accruedPercent;

        System.out.println("Сумма вклада: " + depositSumm);
        System.out.println("Начисленный процент: " + accruedPercent);
        System.out.println("Итоговая сумма с %: " + totalAmount);
    }

    private static void getGradesBySubjects() {
        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade;
        int programmingGrade;

        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent < 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent < 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent < 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent < 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        double avrGrade = ((double)(historyGrade + programmingGrade) / 2);
        double avrPercent = (double)(historyPercent + programmingPercent) / 2;

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
        int summ = 567;
        int num100BanknotesAvl = 10;
        int num10BanknotesAvl = 5;
        int num1BanknotesAvl = 50;

        int ones = summ % 10;
        int tens = summ / 10 % 10;
        int hundreds = summ / 100;

        int num1BanknotesNeeded = ones;
        num1BanknotesAvl -= ones;

        int num10BanknotesNeeded;
        if (num10BanknotesAvl >= tens) {
            num10BanknotesNeeded = tens;
            num10BanknotesAvl -= tens;
        } else
        {
            num10BanknotesNeeded = num10BanknotesAvl;
            num1BanknotesNeeded += (tens - num10BanknotesAvl) * 10;
            num1BanknotesAvl -= (tens - num10BanknotesAvl) * 10;
            num10BanknotesAvl = 0;
        }

        int num100BanknotesNeeded;
        if (num100BanknotesAvl >= hundreds) {
            num100BanknotesNeeded = hundreds;
            num100BanknotesAvl -= hundreds;
        } else
        {
            num100BanknotesNeeded = num100BanknotesAvl;
            if ((hundreds - num100BanknotesAvl) * 10 <= num10BanknotesAvl) {
                num10BanknotesNeeded += (hundreds - num100BanknotesAvl) * 10;
                num10BanknotesAvl -= (hundreds - num100BanknotesAvl) * 10;
            } else {
                num10BanknotesNeeded += num10BanknotesAvl;
                num1BanknotesNeeded += (hundreds - num100BanknotesAvl - 
                    ((double)num10BanknotesAvl / 10)) * 100;
                num1BanknotesAvl -= num1BanknotesNeeded;
                num10BanknotesAvl = 0;
            }
            num100BanknotesAvl = 0;
        }

        System.out.println("Необходимо снять " + summ + " USD");
        System.out.println(num100BanknotesNeeded + " банкнот номиналом 100");
        System.out.println(num10BanknotesNeeded + " банкнот номиналом 10");
        System.out.println(num1BanknotesNeeded + " банкнот номиналом 1");
        summ = num100BanknotesNeeded * 100 + num10BanknotesNeeded * 10 + 
            num1BanknotesNeeded * 1;
        System.out.println("Выдаваемая сумма: " + summ);
    }
}