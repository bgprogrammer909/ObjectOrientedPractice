import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // Write a program to input a character and check if it is a vowel or a consonant using if-else.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char c=sc.next().charAt(0);
        c=Character.toLowerCase(c);
        sc.close();
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("it is vowel");
        }else {
            System.out.println("it is consonant");
        }
    }
    
}
