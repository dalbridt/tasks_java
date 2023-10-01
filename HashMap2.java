import java.util.Scanner; 
import java.util.HashMap;
import java.util.ArrayList; 

class HashMap2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        HashMap <String, ArrayList<String>> list = new HashMap<>(); 
        int n = sc.nextInt(); 
        sc.nextLine(); 
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String job = sc.nextLine(); 
            if(list.containsKey(job)){
            ArrayList <String> temp = list.get(job); 
            temp.add(name); 
            list.put(job, temp);
            } else {
            ArrayList <String> Names = new ArrayList<>();
            Names.add(name); 
             list.put(job, Names); // key = job  & value = name
            }
        }
        sc.close();
        int quantity = 0; 
        String popular = ""; 
        for (String key: list.keySet()){
            if(quantity <  list.get(key).size()){
                quantity = list.get(key).size();
                popular = key;
            }
        }
        System.out.println(quantity);
        System.out.println(popular);
        for(String z: list.get(popular)){
            System.out.println(z);
        }
    }
}