import java.util.ArrayList;
import java.util.List;
class PalindromeNumber{
    public static void main(String[] args) {
        int x = 112210; 
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        List <Integer> list = new ArrayList<>(); 
        if(x < 0){
           return false; 
        }
        while(x > 0){
            list.add(x%10); 
            x /= 10;
        }

        for(int i = 0; i < list.size() / 2; i++){
            if(list.get(i) != list.get(list.size() - 1 - i)){
                return false; 
            }
        }
        return true; 
    }
}