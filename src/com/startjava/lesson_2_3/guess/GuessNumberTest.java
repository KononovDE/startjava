package com.startjava.lesson_2_3.guess;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        String name = scanner.nextLine();
        Player player1 = new Player(name);

        System.out.println("Введите имя второго игрока");
        name = scanner.nextLine();
        Player player2 = new Player(name);

        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "";
        do {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}