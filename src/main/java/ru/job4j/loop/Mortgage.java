package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        while (amount >= 0) {
            double pay = amount + amount * percent;
            amount = pay - salary;
            year++;
        }

    return year;
}
}





