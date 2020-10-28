package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            for (int i = 1; i < data.length - 1; i++) {
                if (data[index] != data[i]) {
                    result = false;
                    break;
                }
            }
        }
            return result;
    }
}