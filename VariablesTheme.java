public class VariablesTheme {   
    public static void main(String[] args) {
        outputVar();
        calculateCost();
        outputJava();
        outputMinMax();
        swapVar();
        outputSymb();
        divideNum();
        drawArt();
        sumMultOfDigits();
        convertSecondsToTime();
    }

    private static void outputVar() {
        byte bitWidths = 64;
        short ramSize = 8;
        int cores = Runtime.getRuntime().availableProcessors();
        long ssdVolume = 256;
        float screenDiagonal = 15.6f;
        double cpuFrequency = 2.30;
        char wifiStandard = '5';
        boolean numericKeypad = true;

        System.out.println("1. Вывод значений переменных на консоль ");

        System.out.println("Разрядность системы: " + bitWidths);
        System.out.println("Объём оперативной памяти: " + ramSize);
        System.out.println("Количество ядер: " + cores);
        System.out.println("Объём SSD: " + ssdVolume);
        System.out.println("Диагональ экрана: " + screenDiagonal);
        System.out.println("Частота процессора: " + cpuFrequency);
        System.out.println("Стандарт Wi-Fi: " + wifiStandard);
        System.out.println("Цифровой блок клавиатуры: " + numericKeypad);
    }

    private static void calculateCost() {
        float penCost = 100;
        float bookCost = 200;
        int discount = 11;
        float sumDiscount;
        float sumCost;

        System.out.println("\n2. Расчет стоимости товара со скидкой ");
        sumDiscount = (penCost + bookCost) * discount / 100;
        sumCost = (penCost + bookCost) - ((penCost + bookCost) * discount / 100);
        System.out.println("Сумма скидки: " + sumDiscount);
        System.out.println("Общая стоимость товаров со скидкой: " + sumCost);
    }

    private static void outputJava() {
        System.out.println("\n3. Вывод слова JAVA ");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
    }

    private static void outputMinMax() {
        byte byteVar = Byte.MAX_VALUE;
        short shortVar = Short.MAX_VALUE;
        int intVar = Integer.MAX_VALUE;
        long longVar = Long.MAX_VALUE;

        System.out.println("\n4. Вывод min и max значений целых числовых типов");

        System.out.println("byte (Нач. значение):" + byteVar);
        System.out.println("short (Нач. значение):" + shortVar);
        System.out.println("int (Нач. значение):" + intVar);
        System.out.println("long (Нач. значение):" + longVar);
        System.out.println();

        byteVar++;
        shortVar++;
        intVar++;
        longVar++;
        System.out.println("byte (Инк. значение):" + byteVar);
        System.out.println("short (Инк. значение):" + shortVar);
        System.out.println("int (Инк. значение):" + intVar);
        System.out.println("long (Инк. значение):" + longVar);
        System.out.println();

        byteVar--;
        shortVar--;
        intVar--;
        longVar--;
        System.out.println("byte (Дек. значение):" + byteVar);
        System.out.println("short (Дек. значение):" + shortVar);
        System.out.println("int (Дек. значение):" + intVar);
        System.out.println("long (Дек. значение):" + longVar);
    }

    private static void swapVar() {
        int num1 = 2;
        int num2 = 5;
        int num3;
        
        System.out.println("\n5. Перестановка значений переменных");

        System.out.println("\nПерестановка с помощью третьей переменной");
        System.out.println("Исх. значение первой переменной: " + num1);
        System.out.println("Исх. значение второй переменной: " + num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Нов. значение первой переменной: " + num1);
        System.out.println("Нов. значение второй переменной: " + num2);

        System.out.println("\nПерестановка с помощью арифметических операций");
        System.out.println("Исх. значение первой переменной: " + num1);
        System.out.println("Исх. значение второй переменной: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Нов. значение первой переменной: " + num1);
        System.out.println("Нов. значение второй переменной: " + num2);

        System.out.println("\nПерестановка с помощью побитовой операции");
        System.out.println("Исх. значение первой переменной: " + num1);
        System.out.println("Исх. значение второй переменной: " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Нов. значение первой переменной: " + num1);
        System.out.println("Нов. значение второй переменной: " + num2);
    }

    private static void outputSymb() {
        char symb1 = 35;
        char symb2 = 38;
        char symb3 = 64;
        char symb4 = 94;
        char symb5 = 95;
        
        System.out.println("\n6. Вывод символов и их кодов");
        System.out.println("Код Символ");
        System.out.println("35 " + symb1);
        System.out.println("38 " + symb2);
        System.out.println("64 " + symb3);
        System.out.println("94 " + symb4);
        System.out.println("95 " + symb5);
    }

    private static void divideNum() {
        int num = 123;
        int hundredsCount;
        int tensCount;
        int onesCount;
        
        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");

        hundredsCount = num / 100;
        tensCount = num / 10;
        onesCount = num / 1;
        
        System.out.println("Число " + num + " содержит:");
        System.out.println(hundredsCount + " сотен");
        System.out.println(tensCount + " десятков");
        System.out.println(onesCount + " единиц");
    }

    private static void drawArt() {
        char symb1 = 47; // /
        char symb2 = 92; // \
        char symb3 = 40; // (
        char symb4 = 41; // )
        char symb5 = 95; // _
        
        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        System.out.println("     " + symb1 + symb2 + "     ");
        System.out.println("    " + symb1 + "  " + symb2 + "    ");
        System.out.println("   " + symb1 + symb5 + symb3 +" " + symb4 + symb2 + "   ");
        System.out.println("  " + symb1 + "      " + symb2 + "    ");
        System.out.println(" " + symb1 + symb5 + symb5 + symb5 + symb5 + symb1 + symb2 + symb5 + symb5 + symb2 + " ");
    }

    private static void sumMultOfDigits() {
        int num = 345;
        int sum;
        int mult;
        int remainder;
        int divinder;
        System.out.println("\n9. Вывод произведения и суммы цифр числа");

        remainder = num % 10;
        sum = remainder;
        mult = remainder;
        divinder = num / 10;

        remainder = divinder % 10;
        sum += remainder;
        mult *= remainder;
        divinder /= 10;

        remainder = divinder % 10;
        sum += remainder;
        mult *= remainder;

        System.out.println("Cумма цифр числа " + num + " = " + sum);
        System.out.println("Произведение цифр числа " + num + " = " + mult);
    }

    private static void convertSecondsToTime() {
        int totalSeconds = 86399;
        int hours;
        int minutes;
        int seconds;

        System.out.println("\n10. Вывод времени");
        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}