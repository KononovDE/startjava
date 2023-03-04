package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];
    private int currentTry;

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOfRange(nums, 0, currentTry);
    }

    public void addNum(int num) {
        nums[currentTry - 1] = num;
    }

    public int getCurrentTry() {
        return currentTry;
    }

    public void setCurrentTry(int currentTry) {
        this.currentTry = currentTry;
    }

    public void clearTry() {
        Arrays.fill(nums, 0, currentTry, 0);
        setCurrentTry(0);
    }
}
