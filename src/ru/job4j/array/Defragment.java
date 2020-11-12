package ru.job4j.array;
// 6.8. Дефрагментация массава
public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = point; i < array.length; i++) {
                    if (array[i] != null) {
                        String temp = array[point];
                        array[point] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
            System.out.println(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.println(compressed[index] + " ");
        }
    }
}
