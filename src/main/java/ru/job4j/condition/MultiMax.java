package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int m = Math.max(first, second);
        return m > third ? m : third;
    }

    public static int max1(int first, int second, int third) {
        int m = Math.max(first, second);
        return m > third ? m : third;
    }

    public static int max3(int first, int second, int third) {
        int m = second;
        return m == third ? m : third;
    }
}