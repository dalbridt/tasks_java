class SudokuSolver {
    // problem 37 leetcode
    public static void main(String[] args) {

        char[][] board = new char[9][9];
        board[0] = new char[] { '7', '.', '.', '.', '.', '.', '1', '5', '8' };
        board[1] = new char[] { '9', '2', '.', '.', '.', '.', '.', '.', '.' };
        board[2] = new char[] { '.', '.', '.', '.', '.', '.', '.', '.', '6' };
        board[3] = new char[] { '.', '.', '.', '.', '.', '.', '.', '.', '3' };
        board[4] = new char[] { '.', '3', '.', '.', '.', '7', '.', '.', '4' }; 
        board[5] = new char[] { '.', '.', '.', '6', '.', '.', '.', '7', '2' };
        board[6] = new char[] { '.', '.', '.', '.', '.', '.', '4', '.', '.' };
        board[7] = new char[] { '.', '.', '6', '7', '.', '.', '.', '8', '.' };
        board[8] = new char[] { '.', '.', '.', '.', '.', '6', '.', '.', '.' };
        solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(char[][] board) {
        if (board == null || board.length != 9) {
            return;
        }
        solver(board);
    }

    public static boolean solver(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solver(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c)
                return false;
            if (board[row][i] != '.' && board[row][i] == c)
                return false;
        }
        for (int i = row - row % 3; i < (row - row % 3) + 3; i++) {
            for (int j = col - col % 3; j < (col - col % 3) + 3; j++) {
                if (board[i][j] != '.' && board[i][j] == c)
                    return false;
            }
        }
        return true;
    }

}
