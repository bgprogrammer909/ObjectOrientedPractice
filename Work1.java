// Write a method to print all odd numbers from 1 to a given number n
import java.util.Scanner;
public class Work1 {
    public static void odd(int num){
        System.out.println("The odd  number till "+num+" are:");
        for(int i=1;i<=num;i++){
            if(i%2!=0){
            System.out.println(i);
            }
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        odd(num);
        sc.close();
    }
    
}
