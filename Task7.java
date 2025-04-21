import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Input the age of a person and check if they are eligible to vote (18 or older).
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        sc.close();
        if (age>=18){
            System.out.println("you are eligible to vote");
        }else {
            System.out.println("not eligible vote");
        }
    }
    
}
