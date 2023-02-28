package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];
    private int currentTry;

    public Player(String name) {
        this.name = name;
        Arrays.fill(nums, 0);
    }
    public String getName() {
        return name;
    }
    public int[] getNums() {
        return nums;
    }
    public void setNums(int[] nums) {
        this.nums = nums;
    }
    public int getCurrentTry() {
        return currentTry;
    }
    public void setCurrentTry(int currentTry) {
        this.currentTry = currentTry;
    }
}
