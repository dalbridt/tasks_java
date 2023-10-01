package oop_tryouts;

public class Animal{

String type = "";

private String name = "";

private int age;

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

void setAge(int age){
    if (age > 0 && age < 100){
    this.age = age; 
    }
}
int getAge(){
    return this.age; 
}

void setName(String newName) {

this.name = newName;
}

String getName(){
    return this.name; 
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