import java.util.Scanner;
public class Task11{
    public static void main(String[] args) {
        // Input a number from the user and display whether it is a prime number using a for loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        sc.close();
        int k=0;
        for(int i=1;i<=num;i++){
            if (num%i==0){
                k+=1;
            }
        }
        if (k==1){
            System.out.println("it is 1 which is neither prime not composite");
        }else if (k==2){
            System.out.println("It is prime");
        }else if (k>2){
            System.out.println("It is composite");
        }
    }
}