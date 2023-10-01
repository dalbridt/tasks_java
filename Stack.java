import java.util.Scanner; 
import java.util.ArrayList; 

class Stack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        ArrayList <String> chair = new ArrayList <>(); 

        for(int i = 0; i<= n; i++){
            String [] item = sc.nextLine().split(" "); 
            if(item[0].equals("push")){
                chair.add(item[1]); 
            } else if(item[0].equals("pop")){
                int last = chair.size();
                System.out.println("Петя взял " + chair.remove(last-1));
            }
        }
        for(String i: chair){
            System.out.print(i + " ");
        }
    }
}