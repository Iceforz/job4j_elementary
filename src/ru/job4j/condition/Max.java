package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int max;
        max = first >= second ? first : second;
        return max;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        return this.max(temp, third);
    }

    public int max(int first, int second, int third, int fourth) {
        int temp = this.max(first, second, third);
        return this.max(temp, fourth);
    }
}