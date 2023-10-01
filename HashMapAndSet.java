import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
 
class HashMapAndSet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap <String, HashSet<String>> players = new HashMap<>(); 
        for(int i = 0; i < n; i++){
            String [] line = sc.nextLine().split(" ");
            line[0] = line[0].substring(0, line[0].length() - 1);
            HashSet <String> words = new HashSet<>(); 
            for(int j = 1; j <= line.length - 1; j++){
                line[j] = line[j].toLowerCase(); 
                words.add(line[j]); 
            }
            players.put(line[0], words);
        }
        int k = sc.nextInt();
        sc.close();
        int amount = 0;
        String best = "";  
        for(String key: players.keySet()){
            HashSet <String> newWords = new HashSet<>(); 
           for(String word: players.get(key)){
            if(word.length() >= k){
              newWords.add(word);
            }
           }
           players.put(key, newWords);

          if(players.get(key).size() > amount){
            amount = players.get(key).size(); 
            best = key; 
           }
        }
       System.out.println(best + " " + amount);
    }
}