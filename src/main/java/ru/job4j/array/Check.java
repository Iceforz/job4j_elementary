package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean isTrue = false;
        boolean isFalse = false;
        for (int index = 0; index < data.length; index++) {
            if (!data[index]) {
                isFalse = true;
                if (isTrue) {
                    result = false;
                } else {
                    isTrue = true;
                    if (isFalse) {
                        result = false;
                    }
                }
            }
        }

                return result;
            }
        }




