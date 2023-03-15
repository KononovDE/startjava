package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static int playerNum;

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        Player player1 = createPlayer();
        Player player2 = createPlayer();
        Player player3 = createPlayer();

        GuessNumber game = new GuessNumber(3, player1, player2, player3);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    private static Player createPlayer() {
        playerNum++;
        System.out.println("Введите имя игрока " + playerNum);
        Scanner scanner =  new Scanner(System.in);
        Player player = new Player(scanner.nextLine());
        return player;
    }
}
