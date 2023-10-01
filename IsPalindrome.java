import java.util.Scanner;
// leetcode problem 125. Valid Palindrome
class IsPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine(); 
        System.out.println(isPalindrome(s)); 
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        System.out.println(s);

        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 -i)){
                return false; 
            }
        }
        return true; 
    }
}