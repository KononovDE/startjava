package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static int playerNum;

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        Player player1 = createPlayer(scanner);
        Player player2 = createPlayer(scanner);
        Player player3 = createPlayer(scanner);

        GuessNumber game = new GuessNumber(playerNum, player1, player2, player3);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    private static Player createPlayer(Scanner scanner) {
        System.out.println("Введите имя игрока " + ++playerNum);
        return new Player(scanner.nextLine());
    }
}
