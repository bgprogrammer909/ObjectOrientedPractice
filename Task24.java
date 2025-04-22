import java.util.Scanner;
public class Task24 {
    public static void main(String[] args) {
        // Input n and print the first n terms of the Fibonacci series.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1,c;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;  
            a = b; 
            b = c; 
        }
    }
}
