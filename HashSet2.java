import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner; 

class HashSet2{
    public static void main(String[] args) {
        HashSet <String> list = new HashSet<>(); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine();
        for(int i = 0; i < n; i++){
           String [] line = sc.nextLine().split(" ");
           List <String> glist = Arrays.asList(line);
            list.addAll(glist);
        }
        sc.close();
        System.out.println(list.size());
        int counter = 1; 
        for(String g: list){
            System.out.println(counter + " " + g);
            counter++;
        }
    }
}