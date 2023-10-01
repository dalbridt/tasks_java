import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Anagrams {
    // leetcode problem 49. Group Anagrams
    public static void main(String[] args) {
        String[] strs = { "" };

        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finRes = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char [] arr = s.toCharArray(); 
            sortArr(arr);
            String key = String.valueOf(arr); 
            if(!map.containsKey(key)){
               List <String> current = new ArrayList <>(); 
               current.add(s); 
                map.put(key, current); 
            } else {
                map.get(key).add(s); 
            }
        }
        finRes.addAll(map.values());
        /// debug print
        for (List<String> list : finRes) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
        return finRes;
    }

    public static void sortArr(char[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}