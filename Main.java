import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    // leetcode problem 486. Predict the Winner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> proviso = new ArrayList<>();
        while (sc.hasNextInt()) {
            proviso.add(sc.nextInt());
        }
        int[] arr = new int[proviso.size()];
        for (int i = 0; i < proviso.size(); i++) {
            arr[i] = proviso.get(i);
        }
        predictTheWinner(arr);
    }

    public static boolean predictTheWinner(int[] nums) {
        ArrayList<Integer> List = new ArrayList<>();
        for (int i : nums) {
            List.add(i);
        }
        int player1 = 0;
        int player2 = 0;
        int iter = 1;
        int length = nums.length - 1;

        while (length >= 0) {
            int current = Math.max(List.get(0), List.get(length));
            if (iter % 2 != 0) {
                player1 += current;
            } else {
                player2 += current;
            }
            if(List.get(0) > List.get(length)){
                List.remove(0);
            } else{
                List.remove(length);
            }

            length--;
            iter++;
            // print for debug
            System.out.println("current array: ");
            for (int i : List) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("player 1 score: " + player1 + "\t" + " player 2 score: " + player2);

        }
        return true;
    }
}
