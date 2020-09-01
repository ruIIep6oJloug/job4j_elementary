package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first > second && first > third) {
            result = first;
        } else if (second > first && second > third) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = MultiMax.max(5, 8, 3);
        System.out.println(rsl);
    }
}
