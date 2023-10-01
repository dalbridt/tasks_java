import java.util.Scanner;

class recursTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n -1);
    }
}