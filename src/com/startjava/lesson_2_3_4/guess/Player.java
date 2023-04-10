package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int MAX_TRIES = 10;
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private String name;
    private int[] nums = new int[MAX_TRIES];
    private int currentTry;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addNum(int num) {
        if (num < START_RANGE || num > END_RANGE) {
            return false;
        }
        nums[currentTry] = num;
        currentTry++;
        return true;
    }

    public int getCurrentNum() {
        return nums[currentTry - 1];
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, currentTry);
    }

    public int getCurrentTry() {
        return currentTry + 1;
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

    public String toString() {
        return getName();
    }
}
