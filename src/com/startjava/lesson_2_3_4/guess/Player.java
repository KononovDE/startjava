package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class Player {
    
    private String name;
    private int[] nums = new int[10];
    private int currentTry;
    private int wins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentTry() {
        return currentTry + 1;
    }

    public int getCurrentNum() {
        return nums[currentTry];
    }

    public void addNum(int num) {
        Scanner scanner =  new Scanner(System.in);
        if (num <= 0 || num > 100) {
            System.out.println("Число " + num + " не входит в полуинтервал (0, 100]");
        } else {
            nums[currentTry] = num;
        }
    }

    public void incrementWin() {
        wins++;
    }

    public void incrementCurrentTry() {
        currentTry++;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, currentTry);
    }

    public void clearTries() {
        Arrays.fill(nums, 0, currentTry, 0);
        currentTry = 0;
    }

    public int getWins() {
        return wins;
    }

    public void clearWins() {
        wins = 0;
    }
}
