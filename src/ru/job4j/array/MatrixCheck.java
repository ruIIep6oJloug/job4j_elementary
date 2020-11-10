package ru.job4j.array;
// 6.7.1. Моно строка в матрице.
// 6.7.2. Моно столбец в матрице.
// 6.7.3. Массив диагонали матрицы.
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i <= board[row].length - 1; i++) {
           if (board[row][i] != 'x') {
                    result = false;
                    break;
                }
        }
            return result;
    }

    public static boolean momoVertical(char[][] board, int column) {
       boolean result = true;
       for (int index = 0; index < board.length; index++) {
           if (board[index][column] != 'x') {
               result = false;
               break;
           }
       }
       return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
}
