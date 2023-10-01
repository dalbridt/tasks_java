import java.util.Scanner;

class PinCode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        boolean pin_code_coincided = true;
        while (counter < 5){
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            counter++;
            if(correct.equals(vasya)){
                System.out.println("СORRECT");
                pin_code_coincided = true;
                break;
            } else if( !correct.equals(vasya) && counter < 5)
            System.out.println("INCORRECT" + counter);
            pin_code_coincided = false;
        }
        if (!pin_code_coincided){
            System.out.println("Error");
        }
    }
}