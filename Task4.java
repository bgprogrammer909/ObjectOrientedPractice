import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        // Write a program that takes a number and checks if it is divisible by both 5 and 11.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        sc.close();
        if (num%5==0 && num%11==0){
            System.out.println("It is divisible by 5 and 11");
        }else {
            System.out.println("Not divisible by 5 and 11");
        }
    }
}
