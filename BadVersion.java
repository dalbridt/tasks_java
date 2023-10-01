import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class BadVersion {
    // leetcode problem 278. First Bad Version

    public static void main(String[] args) {
        int total = 2126753390;
        try {
            FileWriter file = new FileWriter("logs.txt", false);
            PrintWriter out = new PrintWriter(file);
            out.println(" |||||||||||||||||| ");
            out.println( " //// "+ firstBadVersion(total) + " //// ");
            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isBadVersion(int version) {
        if (version > 1702766719) {
            return true;
        } else {
            return false;
        }
    }

    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n; 
        while (low < high){
            int mid = low + (high - low) / 2; 
            if(isBadVersion(mid)){
                high = mid; 
            } else {
                low = mid + 1; 
            }
        }
        return low; 
    }

}