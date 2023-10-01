import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PerfectSquare {
    public static void main(String[] args) {
        int n = 13;
        try{
        FileWriter file = new FileWriter ("logs.txt", false); 
        PrintWriter out = new PrintWriter (file); 
        out.println("final answer is: " + numSquares(n, out));
        file.close();
        out.close();
        } catch (IOException e ){
           e.printStackTrace(); 
        }
    }

    public static int numSquares(int n, PrintWriter out) {
        if (n < 4)
            return n;

        int ans = n;

        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            out.println( "-------------------------------"); 
            out.println( "число в цикле:" + i + "егo квадрат: " + square ); 
            out.println( "-------------------------------"); 
            out.println("чекаем минимум от: " + ans + " " + (1 + numSquares(n - square, out))); 
             out.println( "-------------ЩА БУДЕТРРРРРЕКУРСИЯ !! ------------------"); 
            ans = Math.min(ans, 1 + numSquares(n - square, out));
        }
        return ans;
    }

}

// найти максимально возможный квадрат
// отнять этот квадрат и повторить ф-цию
// сделать перебор с возвратом к предыдущему значению, если пошло не так