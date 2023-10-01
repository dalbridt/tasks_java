import java.util.Scanner;

class StringT{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine(); 
    System.out.println(lengthOfLastWord(line));
}

public static int lengthOfLastWord(String s) {
    String [] spaced = s.split(" ");
    return spaced[spaced.length-1].length();     
}
}