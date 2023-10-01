import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Debug {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
       System.out.println(letterCombinations(digits)); 
    }

    private static List<String> combinations = new ArrayList<>();
    private static Map<Character, String> letters = Map.of(
        '2', "abc",
        '3', "def",
        '4', "ghi",
        '5', "jkl",
        '6', "mno",
        '7', "pqrs",
        '8', "tuv",
        '9', "wxyz"
    );
    private static String phoneDigits;

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return combinations;
        }
        
        phoneDigits = digits;
        backtrack(0, new StringBuilder());
        
        return combinations;
    }
    
    private static void backtrack(int index, StringBuilder current) {
        if (index == phoneDigits.length()) {
            combinations.add(current.toString());
            return;
        }
        
        char digit = phoneDigits.charAt(index);
        String lettersForDigit = letters.get(digit);
        
        for (char letter : lettersForDigit.toCharArray()) {
            current.append(letter);
            backtrack(index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
