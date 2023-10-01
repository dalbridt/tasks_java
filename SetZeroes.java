import java.util.HashSet;

class SetZeroes {
    // leetcode problem 73. Set Matrix Zeroes
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0] = new int[] { 0, 1, 2, 0 };
        matrix[1] = new int[] { 3, 4, 5, 2 };
        matrix[2] = new int[] { 1, 3, 1, 5 };
        print(matrix);
        setZeroes(matrix);
        print(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(rows.contains(i)){
                    matrix[i][j] = 0; 
                }
                if(cols.contains(j)){
                    matrix[i][j] = 0; 
                }
            }
        }
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ---------------------- ");
    }
}