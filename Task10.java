import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        // Write a program to take a number from the user and print whether it is a leap year or not.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year=sc.nextInt();
        sc.close();
        if ((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println(year +" is a leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
    
}
