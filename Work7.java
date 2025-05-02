// Create a method to check whether a given number is a palindrome prime
import java.util.Scanner;
public class Work7 {
    public static void palPrime(int num){
        int ogNum=num,rev=0, count=0;
        while(num!=0){
            int dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        for(int i=1;i<=ogNum;i++){
            if (ogNum%i==0){
                count++;
            }

        }
        if (ogNum==rev && count==2 && ogNum!=1){
            System.out.println("it is palindrome and prime");
        }else{
            System.out.println("not palindrome prime");
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        palPrime(num);
        sc.close();
    }
    
}