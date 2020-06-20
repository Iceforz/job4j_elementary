package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        int num = 0;
        for (int i = 2; i <= number - 1; i++) {
            num += i;
            if ((number % number == 0 && number % 1 == 0 && number % i != 0)) {
                prime = true;
        } else if ((number % num) == 0) {
            prime = false;
            break;
        }
        }
        return prime;
    }
}

