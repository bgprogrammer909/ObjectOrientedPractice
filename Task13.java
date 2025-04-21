import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        // Take a number n and print the sum of first n natural numbers using a loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till you want the sum (n)");
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        for( int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("the sum is "+ sum);
}
}