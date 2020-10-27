package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int a = 0; a < pref.length - 1; a++) {
            if (word[a] == pref[a]) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
