// Create a method to convert a given number of days into years, months, and day
import java.util.Scanner;
public class Work2 {
    public static void convertDay(int days){
       int year=days/365;
       int month=(days%365)/30;
       int day=(days%365)%30;
       System.out.println("year:"+year+" month:"+month+" day:"+day);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of days");
        int days=sc.nextInt();
        convertDay(days);
        sc.close();

    }
    
}
