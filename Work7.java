// Write a method to swap two numbers using a temporary variable
import java.util.Scanner;
public class Work7 {
    public static void swap(int num1,int num2){
    System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);
    int temp;
    temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=sc.nextInt();

        System.out.println("Enter another number");
        int num2=sc.nextInt();
        
        swap(num1,num2);
        sc.close();
    }
    
}
