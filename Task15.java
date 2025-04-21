import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        // Input a number and display the factorial of that number using a for loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nunber you want factorial of ");
        int n=sc.nextInt();
        sc.close();
        int fac=1;
        for(int i=n;i>=1;i--){
            fac*=i;
        }
        System.out.println("The factorial of "+n+" is "+fac);
    }
}
