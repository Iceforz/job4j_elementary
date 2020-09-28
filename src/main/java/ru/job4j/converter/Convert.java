package ru.job4j.converter;

public class Convert {
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int euro = 70;
        int rubleToEuro = in / euro;
        int out = rubleToEuro;
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
