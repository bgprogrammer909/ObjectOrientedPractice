// Create a method to find the sum of the first n natural numbers
import java.util.Scanner;
public class Work10 {
    public static int sumOfNaturalNo(int num){
        int sum=0;
        for (int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number n till where you want sum");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int ans=sumOfNaturalNo(num);
        System.out.println("sum of natural number till is "+ans);
    }
}
