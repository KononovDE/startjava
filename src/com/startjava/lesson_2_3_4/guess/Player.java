package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private String name;
    private int[] nums = new int[10];
    private int currentTry;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentTry() {
        return currentTry + 1;
    }

    public boolean addNum(int num) {
        if (num < START_RANGE || num > END_RANGE) {
            System.out.println("Число " + num + " не входит в полуинтервал (" + (START_RANGE - 1) +
                    ", " + END_RANGE + "]");
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
