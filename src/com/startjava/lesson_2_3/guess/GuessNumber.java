package com.startjava.lesson_2_3.guess;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    
    public GuessNumber(Player player1, Player player2) {
        this.player1 = currentPlayer = player1;
        this.player2 = player2;
    }

    public void start() {
        int playerNum = 0;
        int hiddenNum = 0;
        Scanner scanner =  new Scanner(System.in);
        hiddenNum = (int) (Math.random() * 100) + 1;
        while (playerNum != hiddenNum) {
            System.out.println("Угадывает " + currentPlayer.getName());
            playerNum = scanner.nextInt();
            if (playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер ");
            } else if (playerNum < hiddenNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер ");
            }
            changePlayer();
        }
        System.out.println("Искомое число: " + playerNum + "\nПобедил " + currentPlayer.getName());
    }

    public void changePlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }
}