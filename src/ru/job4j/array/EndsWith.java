package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int a = 0; a < post.length; a++) {
            if (word[word.length - 1 - a] == post[post.length - 1 - a]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

}
