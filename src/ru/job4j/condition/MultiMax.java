package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int m = first > second ? first : second;
        int z = m > third ? m : third;
        return z;

    }

    public static int max1(int first, int second, int third) {
        int m = first > second ? first : second;
        int z = m > third ? m : third;
        return z;
    }

    public static int max3(int first, int second, int third) {
        int m = first == second ? first : second;
        int z = m == third ? m : third;
        return z;
    }
}