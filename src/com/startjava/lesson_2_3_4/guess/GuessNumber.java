package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static final int maxPlayers = 3;
    private static final int maxRounds = 3;
    private static final int maxTries = 10;
    private static final int minHiddenNum = 1;
    private static final int maxHiddenNum = 100;
    private final Player[] players = new Player[maxPlayers];
    private Player currentPlayer;
    
    public GuessNumber(int arraySize, Player... players) {
        int[] order = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            order[i] = i + 1;
        }

        this.players[0] = players[0];
        this.players[1] = players[1];
        this.players[2] = players[2];

        tossUp(arraySize);
    }

    private void tossUp(int arraySize) {
        for(int i = 0; i < arraySize; i++) {
            int randomNum = (int) (Math.random() * arraySize) + 1;
            Player swap = players[i];
            players[i] = players[randomNum - 1];
            players[randomNum - 1] = swap;
        }
        System.out.println("Порядок игроков: " + this.players[0].getName() + " " + this.players[1].getName() + " " +
                this.players[2].getName());
    }

    public void start() {
        System.out.println("У каждого игрока по 10 попыток в каждом раунде");
        Scanner scanner = new Scanner(System.in);

        int round = 0;
        while (round < maxRounds) {
            currentPlayer = players[0];
            int hiddenNum = (int) (Math.random() * maxHiddenNum) + minHiddenNum;
            System.out.println("Угадываетcя " + hiddenNum);
            round++;
            System.out.println("\nРаунд " + round);
            while (!isEndRound()) {
                System.out.println("Угадывает " + currentPlayer.getName());
                System.out.println("Попытка " + currentPlayer.getCurrentTry());
                while (currentPlayer.addNums(scanner.nextInt()) == false) {
                }
                if (isCurrentNumRight(hiddenNum)) {
                    System.out.println("Игрок " + currentPlayer.getName() + " угадал число " +
                            currentPlayer.getCurrentNum() + " с " + (currentPlayer.getCurrentTry() - 1) + " попытки");
                    currentPlayer.incrementScore();
                    break;
                }
                if (currentPlayer.getCurrentTry() == maxTries + 1) {
                    System.out.println("У " + currentPlayer.getName() + " закончились попытки");
                }
                changePlayer();
            }
            printNums();
            clearTries();
        }
        printWinner();
        clearScore();
    }

    private boolean isEndRound() {
        for (Player player : players) {
            if (player.getCurrentTry() != maxTries + 1) {
                return false;
            }
        }
        return true;
    }

    private boolean isCurrentNumRight(int hiddenNum) {
        if (currentPlayer.getCurrentNum() == hiddenNum) {
            return true;
        }
        String numState = (currentPlayer.getCurrentNum() > hiddenNum) ? " больше " : " меньше ";
        System.out.println("Число " + currentPlayer.getCurrentNum() + numState + "того, что загадал компьютер");
        return false;
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
            if (player.getScore() > maxWins) {
                maxWins = player.getScore();
                currentPlayer = player;
            }
        }

//      Если несколько игроков c наибольшими победами
        for (Player player : players) {
            if (player.getScore() == currentPlayer.getScore() && player != currentPlayer) {
                System.out.println("Нет итогового победителя");
                return;
            }
        }
        System.out.println("Итоговый победитель: " + currentPlayer.getName() + " c " + currentPlayer.getScore() +
                " победами");
    }

    private void clearScore() {
        for (Player player : players) {
            player.clearScore();
        }
    }
}
