package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
                if (board[index][index] == 1) {
                    if (monoHorizontal(board, index) || monoVertical(board, index)) {
                            rsl = true;
                            break;
                    }
                }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board, int column) {
            boolean rsl = true;
            for (int i = 0; i < board.length; i++) {
                if (board[i][column] != 1) {
                    rsl = false;
                    break;
                }
            }
            return rsl;
    }
}
