import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        // Write a program to check whether a given number is positive, negative, or zero using if-else.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        sc.close();
        if (num==0){
            System.out.println("It is zero");
        }else if (num>0){
            System.out.println("It is positive");
        }else if(num<0){
            System.out.println("It is negative");
        }
    }
    
}
