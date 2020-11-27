package ru.job4j.sort;
//6.9. Жадный алгоритм. Сдача в кофе машине
import java.util.Arrays;
public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int j = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (j - COINS[i] >= 0) {
                rsl[size] = COINS[i];
                j -= COINS[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
