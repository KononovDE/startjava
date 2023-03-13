package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class Player {
    private String name;
    private int[] nums = new int[10];
    private int currentTry = 1;
    private int currentNum;
    private int wins = 0;

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, currentTry - 1);
    }

    public void addNum(int num) {
        setCurrentNum(num);
        nums[currentTry - 1] = currentNum;
        currentTry = currentTry + 1;
    }

    public int getCurrentTry() {
        return currentTry;
    }

    public void clearTries() {
        Arrays.fill(nums, 0, currentTry - 1, 0);
        this.currentTry = 1;
    }

    public void setCurrentNum(int num) {
        Scanner scanner =  new Scanner(System.in);
        while (num <= 0 || num > 100) {
            System.out.println("Число " + num + " не входит в полуинтервал (0, 100]");
            num = scanner.nextInt();
        }
        currentNum = num;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void addWin() {
        wins++;
    }

    public int getWins() {
        return wins;
    }

    public void clearWins() {
        wins = 0;
    }
}
