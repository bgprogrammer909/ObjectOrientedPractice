import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        // Write a Java program to input your full name and print a greeting message.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Welcome to Java "+name);
        sc.close();
        }
    }

