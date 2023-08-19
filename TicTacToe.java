import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        board[0] = new char[] { '-', '-', '-' };
        board[1] = new char[] { '-', '-', '-' };
        board[2] = new char[] { '-', '-', '-' };
        int i = 0;
        while (hasWinner(board) == 0) {
            getMoves(board, i);
            displayBoard(board, hasWinner(board));
            i++;
        }
    }

    public static void displayBoard(char[][] board, int W) {
        System.out.println("-------------");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("-------------");
        if (W == 1) {
            System.out.println(" |||||||  PLAYER 1 WINS  |||||");
        } else if (W == 2) {
            System.out.println(" |||||||  PLAYER 2 WINS  |||||");
        }
    }

    public static void getMoves(char[][] board, int iter) {
        char sign1 = 'x';
        char sign2 = 'o';
        Scanner sc = new Scanner(System.in);
        System.out.println("player " + ((iter % 2) + 1) + ", enter row and col");
        int row = sc.nextInt();
        int col = sc.nextInt();
        if (iter % 2 == 0 && (row >= 0 && row <=2) && (col >= 0 && col <=2) && board[row][col] == '-') {
            board[row][col] = sign1;
        } else if (iter % 2 != 0 && (row >= 0 && row <=2) && (col >= 0 && col <=2)  && board[row][col] == '-') {
            board[row][col] = sign2;
        } else {
            System.out.println("Try another row and col index");
            getMoves(board, iter);
        }
    }

    public static int hasWinner(char[][] board) {
        if ((board[0][0] == 'x' || board[0][0] == 'o') && (board[0][0] == board[0][1] && board[0][0] == board[0][2])) {
            if (board[0][0] == 'x') {
                return 1;
            } else {
                return 2;
            }
        } else if ((board[1][0] == 'x' || board[1][0] == 'o')
                && (board[1][0] == board[1][1] && board[1][0] == board[1][2])) {
            if (board[1][0] == 'x') {
                return 1;
            } else {
                return 2;
            }
        }
        if ((board[2][0] == 'x' || board[2][0] == 'o') && (board[2][0] == board[2][1] && board[2][0] == board[2][2])) {
            if (board[2][0] == 'x') {
                return 1;
            } else {
                return 2;
            }
        } else if ((board[0][0] == 'x' || board[0][0] == 'o')
                && (board[0][0] == board[1][0] && board[0][0] == board[2][0])) {
            if (board[0][0] == 'x') {
                return 1;
            } else {
                return 2;
            }
        } else if ((board[0][1] == 'x' || board[0][1] == 'o')
                && (board[0][1] == board[1][1] && board[0][1] == board[2][1])) {
            if (board[0][1] == 'x') {
                return 1;
            } else {
                return 2;
            }
        } else if ((board[0][2] == 'x' || board[0][2] == 'o')
                && (board[0][2] == board[1][2] && board[0][2] == board[2][2])) {
            if (board[0][2] == 'x') {
                return 1;
            } else {
                return 2;
            }
        } else if ((board[0][0] == 'x' || board[0][0] == 'o')
                && (board[0][0] == board[1][1] && board[0][0] == board[2][2])) {
            if (board[0][0] == 'x') {
                return 1;
            } else {
                return 2;
            }
        } else if ((board[0][2] == 'x' || board[0][2] == 'o')
                && (board[0][2] == board[1][1] && board[0][2] == board[2][0])) {
            if (board[0][2] == 'x') {
                return 1;
            } else {
                return 2;
            }
        } else
            return 0;
    }
}