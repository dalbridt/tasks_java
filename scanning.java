import java.util.Scanner;
// for some reason program doesn't work with condition "hasNext" in while loop
class scanning{
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int res = 1; 

for (int i = 0; i < 3; i++) {
res = res * sc.nextInt();
}
System.out.println(res);

    }
}