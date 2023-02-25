package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setMark("Gipsy Danger Mark-3");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setHeight(260);
        gipsyDanger.setWeight(1980);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);
        System.out.println("Создан Егерь: " + gipsyDanger.getMark());
        System.out.println("Страна: " + gipsyDanger.getOrigin());
        System.out.println("Рост: " + gipsyDanger.getHeight());
        System.out.println("Масса: " + gipsyDanger.getWeight());
        gipsyDanger.walk();
        gipsyDanger.attack();
        gipsyDanger.defence();

        Jaeger strikerEureka = new Jaeger("Striker Eureka Mark-5", "Australia",
                250, 1850, 10, 10, 9);
        System.out.println("\nСоздан Егерь: " + strikerEureka.getMark());
        System.out.println("Страна: " + strikerEureka.getOrigin());
        System.out.println("Рост: " + strikerEureka.getHeight());
        System.out.println("Масса: " + strikerEureka.getWeight());
        strikerEureka.walk();
        strikerEureka.attack();
        strikerEureka.defence();
    }
}