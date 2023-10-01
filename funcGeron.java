import java.util.Scanner;

class funcGeron{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        geron(s1, s2, s3);
    }

    static void geron(double a, double b, double c){
        if(a > (b+c) || b > (a+c) || c > (a+b)){
            System.out.println("Такого треугольника не существует");
        } else {
            double p = (a + b + c) / 2; 
            double S = Math.sqrt(p *(p - a) * (p - b)* (p - c));
            System.out.println(S);
        }
    }
}