// Write a method to print all factors of a number
import java.util.Scanner;
public class Work11 {
    public static void fac(int num){
        System.out.println("the factors of "+num+" are:");
        for (int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to find its factors");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        fac(num);
    }
}
