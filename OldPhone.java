import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

class OldPhone {
    // problem 17 leetcode Letter Combinations of a Phone Number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();

       List<String> result = letterCombinations(digits);
       for (String string : result) {
        System.out.println(string);
       }
    }

    private static Map<Character, String> buttons = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if (digits.length() == 0) {
            return combinations;
        }
        char[] input = digits.toCharArray();
    
        // чисто индексы из функции с генератором
        int[] combinationArrayIndexes = new int[input.length];

        for (int i : combinationArrayIndexes) {
            i = 0;
        }
        int poop = 0; 
        while(poop < 100){
            char[] currentCombination = new char[input.length];
           for(int i = 0; i < currentCombination.length; i++){
            currentCombination[i] = buttons.get(input[i]).charAt(combinationArrayIndexes[i]); 
           }
           String string = String.valueOf(currentCombination);
           System.out.println(string);
           combinationArrayIndexes = generateIndex(combinationArrayIndexes, 3); 
            poop ++;
        }
       
        return combinations;
    }

    public static int [] generateIndex(int [] array, int lettersAmount ) {
        boolean stop = false; 
        while (stop == false) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] < lettersAmount) {
                    array[i]++;
                    return array; 
                } else if (array[i] == lettersAmount && array[i - 1] < lettersAmount) {
                    array[i] = 0;
                    array[i - 1]++;
                    return array;
                } else if (array[i] == lettersAmount || array[i - 1] == lettersAmount) {
                    array[i] = 0;
                    continue; 
                } 
            }
            if(array[0] == lettersAmount){
                int total = 0; 
                for (int k = 0; k < array.length; k++) {
                    total += array [k];  
                }
                if(total == (array.length -1) * array.length){
                    stop = true; 
                }
            }
        }
        return array; 
    }
}