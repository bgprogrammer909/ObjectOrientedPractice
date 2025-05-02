// Create a method to calculate the cube of a given number
import java.util.Scanner;
public class Work11 {
    public static int cube(int num){
        return num*num*num;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to find its cube");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println("The cube of "+num+ " is "+cube(num));;
    }
}
