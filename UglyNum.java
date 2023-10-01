import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// leetcode problem 263. Ugly Number
class UglyNum{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();    
       // System.out.println(isUgly(n));
       System.out.println(uglySieve(n));
       sc.close();
    }

  /*   public static boolean isUgly(int n) {
        if(n <= 0){
            return false; 
        }
        if(n == 1){
            return true; 
        }
        for(int i = 6; i <= n; i++){
            if(n % i == 0 && isPrime(i)){
                System.out.println(i);
                return false; 
            }
        }

        return true; 
    }
    public static boolean isPrime(int n){
         System.out.println(n + "  попало в проверку ");
        if(n % 2 == 0 || n % 3 == 0){
            return false; 
        }
        for(int i = 3; i*i <= n; i++){
            if(n % i == 0){
                System.out.println(n + " не простое число, потому, что делится на " + i );
                return false; 
            }
            i++; 
        }
        System.out.println(n + " простое число ");
        return true; 
    } */
   /*  public static int [] sieve(int n){
        List <Integer> primes = new ArrayList<>(); 
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++){
        prime[i] = true;
        }
        for(int i = 2; i*i <=n; i++){
            if(prime[i] == true){
                for(int p = i * i; p <= n; p+=i){
                    prime[p] = false; 
                }
            }
        }
        for(int i = 2; i <n; i++){
            if(prime[i] == true){
                primes.add(i);
            }
        }
        int [] primeNums = new int[primes.size()]; 
        for(int i = 0; i < primes.size(); i++){
            primeNums[i] = primes.get(i); 
        }
        for (int i : primeNums) {
            System.out.print(i + " ");
        }
        return primeNums; 
    }*/

   /* public static boolean uglySieve(int n){
         if(n <= 0){
            return false; 
        }
        if(n == 1){
            return true; 
        }
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++){
        prime[i] = true;
        }

        for(int i = 2; i*i <=n; i++){
            if(prime[i] == true){
                for(int p = i * i; p <= n; p+=i){
                    prime[p] = false; 
                }
            }
        }
        for(int i = 2; i <n; i++){
            if(prime[i] == true && n % i == 0){
               return false; 
            }
        }
       return true; 
    }*/

}