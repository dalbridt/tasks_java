import java.util.Scanner;

class funcTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        format_number(number);
    }

    static void format_number(String number){
        if(number.length() != 11){
            System.out.println("Неверное число символов");
            return;
        }
        for(char ch : number.toCharArray()){
            if(ch <48 || ch > 57){
                System.out.println("Не все символы являются цифрами");
                return; 
            }
        }
        if(number.toCharArray()[0] != '8'){
            System.out.println("Это не российский номер телефона");
            return;
        }

        System.out.println(number.substring(0, 1) + " (" + number.substring(1, 4)+ ") " + number.substring(4, 7) + "-" + number.substring(7, 9) + "-" + number.substring(9));

    }
}