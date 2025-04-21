import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        // Input three numbers and print the largest using if-else.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number number");
        int num2=sc.nextInt();
        System.out.println("Enter third number");
        int num3=sc.nextInt();
        sc.close();
        if(num1==num2 && num2==num3){
            System.out.println("they are all same number");
        }else if (num1>num2 && num1>num3){
            System.out.println("the highest is "+num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("the highest is "+num2);
        }else if (num3>num1 && num3>num2){
            System.out.println("the highest is "+num3);
        }
}
}
