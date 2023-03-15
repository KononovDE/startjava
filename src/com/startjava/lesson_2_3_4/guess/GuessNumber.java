package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player[] players = new Player[3];

    private Player currentPlayer;

    public GuessNumber(int arraySize, Player... players) {
        int[] order = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            order[i] = i + 1;
        }

        for(int i = 0; i < arraySize; i++) {
            int randomNum = (int) (Math.random() * 3) + 1;
            int swap = order[i];
            order[i] = order[randomNum - 1];
            order[randomNum - 1] = swap;
        }
        this.players[0] = players[order[0] - 1];
        currentPlayer = players[order[0] - 1];
        this.players[1] = players[order[1] - 1];
        this.players[2] = players[order[2] - 1];
        System.out.println("Порядок игроков: " + this.players[0].getName() + " " + this.players[1].getName() + " " +
                this.players[2].getName());
    }

    public void start() {
        System.out.println("У каждого игрока по 10 попыток в каждом раунде");
        Scanner scanner = new Scanner(System.in);

        int round = 0;
        while (round < 3) {
            currentPlayer = players[0];
            int hiddenNum = (int) (Math.random() * 100) + 1;
            System.out.println("Угадываетcя " + hiddenNum);
            round++;
            System.out.println("\nРаунд " + round);
            while (!isEndRound()) {
                System.out.println("Угадывает " + currentPlayer.getName());
                System.out.println("Попытка " + currentPlayer.getCurrentTry());
                while (currentPlayer.getCurrentNum() <= 0 || currentPlayer.getCurrentNum() > 100) {
                    addNum(scanner.nextInt());
                }
                if (currentPlayer.getCurrentNum() == hiddenNum) {
                    System.out.println("Игрок " + currentPlayer.getName() + " угадал число " +
                            currentPlayer.getCurrentNum() + " с " + (currentPlayer.getCurrentTry()) + " попытки");
                    currentPlayer.incrementWin();
                    currentPlayer.incrementCurrentTry();
                    break;
                }
                String numState = (currentPlayer.getCurrentNum() > hiddenNum) ? " больше " : " меньше ";
                System.out.println("Число " + currentPlayer.getCurrentNum() + numState + "того, что загадал компьютер");

                if (currentPlayer.getCurrentTry() == 11) {
                    System.out.println("У " + currentPlayer.getName() + " закончились попытки");
                }
                currentPlayer.incrementCurrentTry();
                changePlayer();
            }
            printNums();
            clearTries();
        }
        printWinner();
        clearWins();
    }

    private boolean isEndRound() {
        for (Player player : players) {
            if (player.getCurrentTry() != 11) {
                return false;
            }
        }
        return true;
    }

    private void addNum(int num) {
        currentPlayer.addNum(num);
    }

    private void changePlayer() {
        currentPlayer = currentPlayer == players[0] ? players[1] : currentPlayer == players[1] ? players[2] :
                players[0];
    }

    private void printNums() {
        for (Player player : players) {
            int[] numsCopy = player.getNums();
            System.out.print("Числа игрока " + player.getName() + ": ");
            for (int num : numsCopy ) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private void clearTries() {
        for (Player player : players) {
            player.clearTries();
        }
    }

    private void printWinner() {
        int maxWins = 0;
        for (Player player : players) {
            if (player.getWins() > maxWins) {
                maxWins = player.getWins();
                currentPlayer = player;
            }
        }

//      Если несколько игроков c наибольшими победами
        for (Player player : players) {
            if (player.getWins() == currentPlayer.getWins() && player != currentPlayer) {
                System.out.println("Нет итогового победителя");
                return;
            }
        }
        System.out.println("Итоговый победитель: " + currentPlayer.getName() + " c " + currentPlayer.getWins() +
                " победами");
    }

    private void clearWins() {
        for (Player player : players) {
            player.clearWins();
        }
    }
}
