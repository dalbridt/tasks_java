import java.util.HashMap;
import java.util.Scanner;

class HashMapa {
    public static void main(String[] args) {
        HashMap<String, Integer> dick = new HashMap <> (); 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String key = sc.nextLine();
            Integer value =1;
            if(dick.containsKey(key)){
                value = dick.get(key);
                value++; 
            }
            dick.put(key, value);
        }
        sc.close();
        int frequent = 0; 
        String result = ""; 
        for (String key: dick.keySet()){
            if(dick.get(key) > frequent){
                frequent = dick.get(key); 
                result = key; 
            }
        }
        System.out.println(result);
    }
}
