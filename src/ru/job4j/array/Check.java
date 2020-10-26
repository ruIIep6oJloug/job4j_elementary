package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int index;
        for (index = 0; index < data.length - 1; index++) {
            int i;
            for (i = 1; i < data.length - 1; i++) {
                if (data[index] != data[i]) {
                    result = false;
                    break;
                }
            }
        }
            return result;
    }
}