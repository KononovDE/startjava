package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {

    private static final int CAPACITY = 3;
    private static final int ROUND_LIMIT = 3;
    private Player[] players = new Player[CAPACITY];

    public GuessNumber(Player... players) {
        this.players = players;
        castLots();
    }

    private void castLots() {
        for(int i = 0; i < CAPACITY; i++) {
            int randomNum = (int) (Math.random() * CAPACITY) + 1;
            Player swap = players[i];
            players[i] = players[randomNum - 1];
            players[randomNum - 1] = swap;
        }
        System.out.println("Порядок игроков: " + Arrays.toString(players));
    }

    public void start() {
        System.out.println("У каждого игрока по 10 попыток в каждом раунде");
        Scanner scanner = new Scanner(System.in);

        int round = 1;
        while (round <= ROUND_LIMIT) {
            round++;
            System.out.println("\nРаунд " + round);
            int hiddenNum = (int) (Math.random() * players[0].END_RANGE) + players[0].START_RANGE;
            System.out.println("Загаданное число: " + hiddenNum);
            startRound(scanner, hiddenNum);
            printNums();
            clearTries();
        }
        printWinner();
        clearScore();
    }

    private void startRound(Scanner scanner, int hiddenNum) {
        while (!isEndRound()) {
            for(int i = 0; i < CAPACITY; i++) {
                System.out.println("Угадывает " + players[i].getName());
                System.out.println("Попытка " + players[i].getCurrentTry());
                while (!addNum(scanner, i)) {
                    System.out.println("Число не входит в полуинтервал (" + (players[i].START_RANGE - 1) + ", " +
                            players[i].END_RANGE + "]");
                }
                if (isGuessed(i, hiddenNum)) {
                    System.out.println("Игрок " + players[i].getName() + " угадал число " +
                            players[i].getCurrentNum() + " с " + (players[i].getCurrentTry() - 1) + " попытки");
                    players[i].incrementScore();
                    return;
                }
                if (players[i].getCurrentTry() == players[i].MAX_TRIES + 1) {
                    System.out.println("У " + players[i].getName() + " закончились попытки");
                }
            }
        }
    }

    private boolean isEndRound() {
        for (Player player : players) {
            if (player.getCurrentTry() != player.MAX_TRIES + 1) {
                return false;
            }
        }
        return true;
    }

    private boolean addNum(Scanner scanner, int i) {
        return players[i].addNum(scanner.nextInt());
    }

    private boolean isGuessed(int playerNum, int hiddenNum) {
        int currentNum = players[playerNum].getCurrentNum();
        if (currentNum == hiddenNum) {
            return true;
        }
        String numState = (currentNum > hiddenNum) ? " больше " : " меньше ";
        System.out.println("Число " + currentNum + numState + "того, что загадал компьютер");
        return false;
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
        Player winner = players[0];
        int maxWins = 0;
        for (Player player : players) {
            if (player.getScore() > maxWins) {
                maxWins = player.getScore();
                winner = player;
            }
        }

//      Если несколько игроков c наибольшими победами
        for (Player player : players) {
            if (player.getScore() == winner.getScore() && player != winner) {
                System.out.println("Нет итогового победителя");
                return;
            }
        }
        System.out.println("Итоговый победитель: " + winner.getName() + " c " +
                winner.getScore() + " победами");
    }

    private void clearScore() {
        for (Player player : players) {
            player.clearScore();
        }
    }
}
