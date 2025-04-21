import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        // Write a program to print the multiplication table of a given number using for loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        sc.close();
        for (int j=1;j<=10;j++){
            System.out.println(num+"x"+j+"="+num*j);
        }
    }
    
}
