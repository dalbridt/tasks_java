import java.util.Scanner;
class replaceSubStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int amount = sc.nextInt(); 
        sc.nextLine();
        String [][] book = new String [amount][] ; 
        for(int i = 0; i < amount; i++){
         book[i] = sc.nextLine().split(" "); 
        }
     
        int req = sc.nextInt();
        sc.nextLine();
        String [] foo = new String[2];
        String [] allerg = new String[req];
        String [] repl = new String[req];
        for(int i = 0; i < req; i++) {
            foo = sc.nextLine().split("-");
            allerg[i] = foo[0].trim();
            repl[i] = foo[1].trim();
        }
        sc.close();
        // dealing with replacements
        for(int i = 0; i < amount; i++){
            for(int j = 0; j < book[i].length; j++){
               for(int k = 0; k < req; k++){
                if(book[i][j].equalsIgnoreCase(allerg[k])){
                    if(Character.isUpperCase(book[i][j].charAt(0))){
                    String cap = repl[k].substring(0, 1).toUpperCase()+ repl[k].substring(1);
                    book[i][j] = cap;
                    } else 
                    book[i][j] = repl[k];
                }
               }
            }
        }
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < book[i].length; j++) {
                System.out.print(book[i][j] + " ");
            }
            System.out.println();
        }
    }
}