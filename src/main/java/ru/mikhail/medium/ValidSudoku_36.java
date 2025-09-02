package ru.mikhail.medium;

public class ValidSudoku_36 {

    public static void main(String[] args) {
        System.out.println(isValidSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        }));
    }

    public static boolean isValidSudoku(char[][] board) {
        boolean[][][] range = new boolean[3][9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char numC = board[i][j];
                if (numC >= '1' && numC <= '9') {
                    int num = numC - '1';
                    int blockInd = (3 * (i / 3)) + (j / 3);
                    if (range[0][i][num] || range[1][j][num] || range[2][blockInd][num]) {
                        return false;
                    }
                    range[0][i][num] = true;
                    range[1][j][num] = true;
                    range[2][blockInd][num] = true;
                }
            }
        }
        return true;
    }
}
