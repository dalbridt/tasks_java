public class UseClasses{    
    public static void main(String[] args) {
        Animal tiger = new Animal("тигр", "Артём");
        tiger.display();

        Animal sparrow = new Animal("воробей", 5);
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();

         
    }
}
class Animal{
    String type = "";
    String name = ""; 
    int age;  
    double weight; 
    boolean isFly; 
    boolean isWalk;
    boolean isSwim;  

    void display(){
        System.out. println(" ================ ");
        System.out.println("Тип: "+ this.type);
        System.out.println("Имя: "+ this.name);
        System.out.println("Возраст: "+ this.age);
        System.out.println("Вес: "+ this.weight);
        System.out.println("Умеет летать: " + (this.isFly?"Да":"Нет"));
        System.out.println("Умеет ходить: " + (this.isWalk?"Да":"Нет"));
        System.out.println("Умеет плавать: " + (this.isSwim?"Да":"Нет"));
        System.out. println(" ================ ");
    }

    void rename(String newName) {
        this.name = newName; 
    }

    void holiday(int days){
        for(int i = 0; i < days; i++){
            this.weight += 1; 
        }
    }
    public Animal(String type, String name){
        this.type = type; 
        this.name = name;
    }
     public Animal(String type, int age){
        this.type = type; 
        this.name = "No name";
        this.age = age; 
    }
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        this.type = type;
        this.name = name; 
        this.age = age;  
        this.weight = weight; 
        this.isFly = isFly; 
        this.isWalk = isWalk;
        this.isSwim = isSwim; 
    }
}