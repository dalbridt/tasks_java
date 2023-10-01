class GameOfLife {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];
        matrix[0] = new int[] { 0, 1, 0 };
        matrix[1] = new int[] { 0, 0, 1 };
        matrix[2] = new int[] { 1, 1, 1 };
        matrix[3] = new int[] { 0, 0, 0 };
        print(matrix);
        System.out.println("------- ");
        gameOfLife(matrix);
        print(matrix);
    }

    public static void gameOfLife(int[][] board) {
        int[][] board2 = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board2[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < board2.length; i++) {
            for (int j = 0; j < board2[0].length; j++) {
                int currentNeighbours = fuckNeighbours(board2, i, j);
                if (board2[i][j] == 1 && (currentNeighbours < 2 || currentNeighbours > 3)) {
                    board[i][j] = 0;
                }
                if (board2[i][j] == 0 && currentNeighbours == 3) {
                    board[i][j] = 1;
                }
            }
        }
    }

    public static int fuckNeighbours(int[][] board, int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                int row = i;
                int col = j;
                if ((i == x && j == y) || (row < 0 || row > board.length - 1)
                        || (col < 0 || col > board[0].length - 1)) {
                    continue;
                }
                if (board[row][col] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int countNeighbours(int[][] board, int x, int y) {
        int count = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i == x && j == y) {
                    continue;
                }
                int row = i;
                int col = j;
                if (row < 0) {
                    row = board.length - 1;
                } else if (row > board.length - 1) {
                    row = 0;
                }
                if (col < 0) {
                    col = board[0].length - 1;
                } else if (col > board[0].length - 1) {
                    col = 0;
                }
                if (board[row][col] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}