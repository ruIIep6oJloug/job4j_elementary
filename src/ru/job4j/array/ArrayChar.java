package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int main = Math.min(word.length, pref.length);
        for (int a = 0; a < main; a++) {
            if (pref[a] == word[a]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
