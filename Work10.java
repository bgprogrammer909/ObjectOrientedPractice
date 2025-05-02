// Write a method to print all factors of a number
import java.util.Scanner;
public class Work10 {
    public static void fac(int num){
        System.out.println("The Factors of "+num+" are:");
        for(int i=1;i<=num;i++){
            if (num%i==0){
                System.out.print(i+",");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        fac(num);;
        sc.close();
    }
    
}