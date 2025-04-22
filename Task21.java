import java.util.Scanner;
public class Task21 {
    public static void main(String[] args) {
        // Write a program to find the sum of digits of a number using a loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number of which you want sum of digit ");
        String numberStr = sc.nextLine();
        sc.close();
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            char a=numberStr.charAt(i);
            sum+=Integer.parseInt(String.valueOf(a));
        }

        System.out.println("Sum of digits: " + sum);
    }
}

