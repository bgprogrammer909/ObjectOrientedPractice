import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        // Take two numbers as input and print their sum, difference, product, and quotient.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number (bigger one)");
        int num1=sc.nextInt();
        System.out.println("Enter first number");
        int num2=sc.nextInt();
        sc.close();
        int sum=num1+num2;
        int product=num1*num2;
        int diff=num1-num2;
        System.out.println("the sum is "+ sum);
        System.out.println("the difference is "+ diff);
        System.out.println("the product "+ product);
        if (num2==0){
            System.out.println("invalid input for division, zero division problem");
        }else{
            int quo=num1/num2;
            System.out.println("the quotient is "+ quo);
        }

    }
}
