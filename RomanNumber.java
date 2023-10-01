import java.util.Scanner; 

class RomanNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        String res = intToRoman(N);

        System.out.println(res);
    }

    public static String intToRoman(int N) {
        String[] romanOnes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };               
        String[] romanDecs = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" }; 
        String[] romanCents = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "MC" };
        String [] romanThous = {"", "M", "MM", "MMM"};
        int one = N % 10;
        N /= 10;
        int dec = N %10;
        N /= 10;
        int cent = N % 10;
        N /=10;
        int thous = N % 10;
    
        String res = romanThous[thous] + romanCents[cent] + romanDecs[dec] + romanOnes[one];
        return res; 
    }
}