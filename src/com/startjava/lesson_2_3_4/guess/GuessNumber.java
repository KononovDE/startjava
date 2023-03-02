package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

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
        System.out.println("У каждого игрока по 10 попыток");
        player1.setCurrentTry(0);
        player2.setCurrentTry(0);
        int playerNum = 0;
        int hiddenNum = 0;
        Scanner scanner =  new Scanner(System.in);
        hiddenNum = (int) (Math.random() * 100) + 1;
//      Всегда начинает первый игрок
        if (currentPlayer == player2) {
            changePlayer();
        }

        while ((player1.getCurrentTry() != 10) || (player2.getCurrentTry() != 10)) {
            incrementTry();
            System.out.println("Угадывает " + currentPlayer.getName());
            System.out.println("Попытка " + currentPlayer.getCurrentTry());
            playerNum = scanner.nextInt();
            addNum(playerNum);
            if (playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер ");
            } else if (playerNum < hiddenNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер ");
            } else {
                System.out.println("Игрок " + currentPlayer.getName() + " угадал число " + playerNum + " с "
                        + currentPlayer.getCurrentTry() + " попытки");
                break;
            }
            if (currentPlayer.getCurrentTry() == 10) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }
            changePlayer();
        }
        printNums();
        clearArrays();
    }

    public void changePlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    public void incrementTry() {
        if (currentPlayer == player1) {
            int currentTry = player1.getCurrentTry();
            player1.setCurrentTry(currentTry + 1);
            currentPlayer = player1;
        } else {
            int currentTry = player2.getCurrentTry();
            player2.setCurrentTry(currentTry + 1);
            currentPlayer = player2;
        }
    }

    public void addNum(int num) {
        if (currentPlayer == player1) {
            player1.setNums(num);
            currentPlayer = player1;
        } else {
            player2.setNums(num);
            currentPlayer = player2;
        }
    }

    public void printNums() {
        int [] numsCopy = player1.getNums();
        System.out.println("Числа игрока " + player1.getName() + ": " + Arrays.toString(numsCopy));
        if (player2.getCurrentTry() > 0) {
            numsCopy = player2.getNums();
            System.out.println("Числа игрока " + player2.getName() + ": " + Arrays.toString(numsCopy));
        }
    }

    public void clearArrays() {
        player1.clearArray();
        player2.clearArray();
    }
}
