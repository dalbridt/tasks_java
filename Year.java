public class Year {
public static void main(String[] argc) {
int inputed = 2020; 
System.out.println(leapYearCount(inputed));
System.out.println(pipYearCount(inputed));
}

public static int leapYearCount(int year) {
    return (year / 4) - (year / 100) + (year / 400);
}

public static int pipYearCount(int year) {
    int count = 0; 
    for(int i = 1; i <= year; i++) {
        if((i% 4 == 0 && i %100 != 0)|| i% 400 == 0) {
            count++; 
        }
    }
    return count;
}

}