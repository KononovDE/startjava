package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class GuessNumber {

    private Player[] players = new Player[2];

    private Player currentPlayer;

    public GuessNumber(Player player1, Player player2) {
        players[0] = player1;
        currentPlayer = player1;
        players[1] = player2;
    }

    public void start() {
        System.out.println("У каждого игрока по 10 попыток");
        setTries(0);
        int playerNum = 0;
        int hiddenNum = (int) (Math.random() * 100) + 1;
        Scanner scanner =  new Scanner(System.in);
//      Всегда начинает первый игрок
        while (currentPlayer != players[0]) {
            changePlayer();
        }
        while (isEndGame() == false) {
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
        clearTries();
    }

    public void changePlayer() {
        currentPlayer = currentPlayer == players[0] ? players[1] : players[0];
    }

    public void incrementTry() {
        for (Player player : players ) {
            if (currentPlayer == player) {
                int currentTry = player.getCurrentTry();
                player.setCurrentTry(currentTry + 1);
                break;
            }
        }
    }

    public void addNum(int num) {
        for (Player player : players ) {
            if (currentPlayer == player) {
                player.addNum(num);
                break;
            }
        }
    }

    public void printNums() {
        for (Player player : players ) {
            int[] numsCopy = player.getNums();
            System.out.print("Числа игрока " + player.getName() + ": ");
            for (int num : numsCopy ) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void clearTries() {
        for (Player player : players ) {
            player.clearTry();
        }
    }

    public void setTries(int num) {
        for (Player player : players ) {
            player.setCurrentTry(num);
        }
    }

    public boolean isEndGame() {
        for (Player player : players ) {
            if (player.getCurrentTry() != 10) {
                return false;
            }
        }
        return true;
    }
}
