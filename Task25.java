import java.util.Scanner;
public class Task25 {
    public static void main(String[] args) {
        // Write a program to count how many digits are in a given number using a loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.close();

        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("It has " + count + " digits");
    }
}
