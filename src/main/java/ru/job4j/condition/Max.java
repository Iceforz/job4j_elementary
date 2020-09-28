package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int max;
        max = Math.max(first, second);
        return max;
    }

    public int max(int first, int second, int third) {
        int temp = max(first, second);
        return this.max(temp, third);
    }

    public int max(int first, int second, int third, int fourth) {
        int temp = this.max(first, second, third);
        return max(temp, fourth);
    }
}