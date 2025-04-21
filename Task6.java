import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Take a number from the user and print whether it is even or odd.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        sc.close();
        if (num%2==0){
            System.out.println("it is even");
        }else {
            System.out.println("it is odd");
        }
    }
    
}
