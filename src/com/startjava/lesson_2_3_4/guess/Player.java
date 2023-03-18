package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class Player {

    private String name;
    private int[] nums = new int[10];
    private int currentTry;
    private int score;
    private static final int minHiddenNum = 1;
    private static final int maxHiddenNum = 100;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentTry() {
        return currentTry + 1;
    }

    public boolean addNums(int num) {
        if (num < minHiddenNum || num > maxHiddenNum) {
            System.out.println("Число " + num + " не входит в полуинтервал (" + (minHiddenNum - 1) +
                    ", " + maxHiddenNum + "]");
            return false;
        } else {
            nums[currentTry] = num;
            currentTry++;
            return true;
        }
    }

    public int getCurrentNum() {
        return nums[currentTry - 1];
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, currentTry);
    }

    public void clearTries() {
        Arrays.fill(nums, 0, currentTry, 0);
        currentTry = 0;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public void clearScore() {
        score = 0;
    }
}
