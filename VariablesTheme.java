public class VariablesTheme {   
    public static void main(String[] args) {
        outputPrimitiveTypesValues();
        calculatePrice();
        outputJava();
        outputMinMax();
        swapVarValues();
        outputSymbols();
        divideNum();
        outputDukeArt();
        sumMultOfDigits();
        convertSecondsToTime();
    }

    private static void outputPrimitiveTypesValues() {
        System.out.println("1. Вывод значений переменных на консоль ");

        byte bitWidths = 64;
        short ramSize = 8;
        int cores = Runtime.getRuntime().availableProcessors();
        long ssdVolume = 256;
        float screenDiagonal = 15.6f;
        double cpuFrequency = 2.30;
        char wifiStandard = '5';
        boolean numericKeypad = true;

        System.out.println("Разрядность системы: " + bitWidths);
        System.out.println("Объём оперативной памяти: " + ramSize);
        System.out.println("Количество ядер: " + cores);
        System.out.println("Объём SSD: " + ssdVolume);
        System.out.println("Диагональ экрана: " + screenDiagonal);
        System.out.println("Частота процессора: " + cpuFrequency);
        System.out.println("Стандарт Wi-Fi: " + wifiStandard);
        System.out.println("Цифровой блок клавиатуры: " + numericKeypad);
    }

    private static void calculatePrice() {
        System.out.println("\n2. Расчет стоимости товара со скидкой ");
        float penPrice = 100;
        float bookPrice = 200;
        float sumPrice = penPrice + bookPrice;
        int discount = 11;
        float sumDiscount = sumPrice * discount / 100;
        float discountPrice = sumPrice - sumDiscount;

        System.out.println("Сумма скидки: " + sumDiscount);
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);
    }

    private static void outputJava() {
        System.out.println("\n3. Вывод слова JAVA ");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
    }

    private static void outputMinMax() {
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNum = Byte.MAX_VALUE;
        short shortNum = Short.MAX_VALUE;
        int intNum = Integer.MAX_VALUE;
        long longNum = Long.MAX_VALUE;

        System.out.println("byte (Нач. значение):" + byteNum);
        System.out.println("short (Нач. значение):" + shortNum);
        System.out.println("int (Нач. значение):" + intNum);
        System.out.println("long (Инк. значение):" + longNum);

        System.out.println("\n byte (Инк. значение):" + ++byteNum);
        System.out.println("short (Инк. значение):" + ++shortNum);
        System.out.println("int (Инк. значение):" + ++intNum);
        System.out.println("long (Инк. значение):" + ++longNum);

        System.out.println("\n byte (Дек. значение):" + --byteNum);
        System.out.println("short (Дек. значение):" + --shortNum);
        System.out.println("int (Дек. значение):" + --intNum);
        System.out.println("long (Дек. значение):" + --longNum);
    }

    private static void swapVarValues() {
        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3 = num1;

        System.out.println("\nПерестановка с помощью третьей переменной");
        System.out.println("Исх. значение первой переменной: " + num1);
        System.out.println("Исх. значение второй переменной: " + num2);

        num1 = num2;
        num2 = num3;
        System.out.println("Нов. значение первой переменной: " + num1);
        System.out.println("Нов. значение второй переменной: " + num2);

        System.out.println("\nПерестановка с помощью арифметических операций");
        System.out.println("Исх. значение первой переменной: " + num1);
        System.out.println("Исх. значение второй переменной: " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Нов. значение первой переменной: " + num1);
        System.out.println("Нов. значение второй переменной: " + num2);

        System.out.println("\nПерестановка с помощью побитовой операции");
        System.out.println("Исх. значение первой переменной: " + num1);
        System.out.println("Исх. значение второй переменной: " + num2);
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("Нов. значение первой переменной: " + num1);
        System.out.println("Нов. значение второй переменной: " + num2);
    }

    private static void outputSymbols() {
        System.out.println("\n6. Вывод символов и их кодов");
        char symb1 = '#';
        char symb2 = '&';
        char symb3 = '@';
        char symb4 = '^';
        char symb5 = '_';

        System.out.println("Код Символ");
        System.out.println((int) symb1 + " " + symb1);
        System.out.println((int) symb2 + " " + symb2);
        System.out.println((int) symb3 + " " + symb3);
        System.out.println((int) symb4 + " " + symb4);
        System.out.println((int) symb5 + " " + symb5);
    }

    private static void divideNum() {
        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int ones = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num / 10 / 10;
        
        System.out.println("Число " + num + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");
    }

    private static void outputDukeArt() {
        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        char underscore  = '_';
        
        System.out.println("     " + slash + backslash + "     ");
        System.out.println("    " + slash + "  " + backslash + "    ");
        System.out.println("   " + slash + underscore + leftBracket +" " + rightBracket +
                backslash + "   ");
        System.out.println("  " + slash + "      " + backslash + "    ");
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash
                + backslash + underscore + underscore + backslash + " ");
    }

    private static void sumMultOfDigits() {
        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        int num = 345;
        int ones = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num / 10 / 10;
        int sum = ones + tens + hundreds;
        int mult = ones * tens * hundreds;;

        System.out.println("Cумма цифр числа " + num + " = " + sum);
        System.out.println("Произведение цифр числа " + num + " = " + mult);
    }

    private static void convertSecondsToTime() {
        System.out.println("\n10. Вывод времени");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;;
        int seconds = totalSeconds % 60;;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
