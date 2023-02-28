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
        System.out.println("Угадывается " + hiddenNum);
//      Всегда начинает первый игрок
        if (currentPlayer == player2) {
            changePlayer();
        }

        while ((player1.getCurrentTry() != 10) || (player2.getCurrentTry() != 10)) {
            incrementTry();
            System.out.println("Попытка 1: " + player1.getCurrentTry());
            System.out.println("Попытка 2: " + player2.getCurrentTry());

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
            int [] nums = player1.getNums();
            nums[player1.getCurrentTry() - 1] = num;
            player1.setNums(nums);
            currentPlayer = player1;
        } else {
            int [] nums = player2.getNums();
            nums[player2.getCurrentTry() - 1] = num;
            player2.setNums(nums);
            currentPlayer = player2;
        }
    }

    public void printNums() {
        int [] numsCopy = Arrays.copyOfRange(player1.getNums(), 0, player1.getCurrentTry());
        System.out.println("Числа игрока " + player1.getName() + ": " + Arrays.toString(numsCopy));
        System.out.println("Попытка 1" + player1.getCurrentTry());
        numsCopy = Arrays.copyOfRange(player2.getNums(), 0, player2.getCurrentTry());
        System.out.println("Числа игрока " + player2.getName() + ": " + Arrays.toString(numsCopy));
        System.out.println("Попытка 2" + player2.getCurrentTry());
    }

    public void clearArrays() {
        Arrays.fill(player1.getNums(), 0, player1.getCurrentTry() - 1, 0);
        Arrays.fill(player2.getNums(), 0, player2.getCurrentTry() - 1, 0);
    }
}
