// Write a method to calculate the compound interest given principal, rate, and time
import java.util.Scanner;
public class Work6 {
    public static void compoundInterest(double p,double t, double r){
        double ans=Math.pow((1+(r/100)), t);
        double amount=p*ans;
        
        double interest=amount-p;
        System.out.println("The compound interest is "+ interest);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a principle");
        double principle=sc.nextDouble();
        
        System.out.println("Enter a rate");
        double rate=sc.nextDouble();
        
        System.out.println("Enter a time in years");
        double time=sc.nextDouble();
        
        compoundInterest(principle, time, rate);
        sc.close();
    }
}