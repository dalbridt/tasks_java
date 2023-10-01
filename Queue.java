import java.util.Scanner; 
import java.util.ArrayList;

class Queue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int requests = sc.nextInt(); 
        String vObrabotke = ""; 
        sc.nextLine();
        ArrayList <String> Ochered = new ArrayList<> (); 

        for(int i = 0; i < requests; i++){
            String [] call = sc.nextLine().split(" ");
            switch(call.length){
                case 1: // следующий (извлечь первого )
                if(call[0].equals("Следующий!") && Ochered.size() != 0) {
                    System.out.println(Ochered.get(0) + " в обработке"); 
                    vObrabotke = Ochered.get(0);
                    Ochered.remove(0);
                } else if(call[0].equals("Следующий!") && Ochered.size() == 0){
                    System.out.println("Отлично, попью чаёк!");
                } 
                break; 
                case 2:  // добавить имя (в конец очереди) или показать спсиок
                if(call[0].equalsIgnoreCase("Добавить")){
                Ochered.add(call[1]);
                System.out.println(call[1] + " в очереди");
                } else if(call[0].equalsIgnoreCase("Посмотреть")){
                    if(Ochered.size() == 0) {
                    System.out.println("*прокатилось перекати-поле*");
                    } else {
                        System.out.println(String.join(" ", Ochered));
                    }
                }
                break; 
                case 4: // имя занимала за имя (найти, поставить после)
                if((call[1].equals("занимал") || call[1].equals("занимала")) && call[2].equals("за")){
                int index = -1;
                index = Ochered.indexOf(call[3]);
                if(call[3].equals(vObrabotke)){
                    Ochered.add(0,call[0]); //Добавить в начало списка!!!!!
                } else if(index == -1 && !(call[3].equals(vObrabotke))){
                    System.out.println(call[0]+ ", не надо тут ля-ля");
                    Ochered.add(call[0]); 
                } else if(index == Ochered.size() - 1){
                    Ochered.add(call[0]);
                } else {
                Ochered.add(index + 1, call[0]);
                }
                 }
                break; 
                case 5: // Стоит ли оно того? Имя
                if(Ochered.size() < 5){
                    Ochered.add(call[4]); 
                } else {
                    System.out.println("Слабак!");
                }
                default:
                break; 
            }
        }
        sc.close();
    }
}