// Write a method to determine whether a number is a Harshad number or not
import java.util.Scanner;
public class Work3 {
    public static void harshad(int num){
        int ogNum=num;
        int digit=0,sum=0;
        while(num!=0){
            digit=num%10;
            sum+=digit;
            num=num/10;
        }
        if (ogNum%sum==0){
            System.out.println(ogNum+" is harshad number, as number is divisble bu sum of digit");
        }else{
            System.out.println("It is not harshad number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        harshad(num);
    }
}