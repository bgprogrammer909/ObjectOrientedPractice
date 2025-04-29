import java.util.Scanner;
public class CwTask {
    public static String primeCheck(int num){
        int count=0;
        String ans="";
        for(int i=1;i<=num;i++){
            if (num%i==0){
                count+=1;
            }
        }
        if (num==1 || count>2){
            ans="It is not prime";
        }else if (count==2){
            ans="It is prime";
        }
        return ans;
    }
    public static void evenCheck(int num) {
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }
    public static void printTable(int num){
            for(int j=1;j<=10;j++){
                System.out.println(num+"x"+j+"="+num*j);
            }
    }
    public static int multiply3(int a,int b, int c){
        int d=a*b*c;
        return d;
    }
    public static void interest(double p,double t,double r){
        double s=(p*t*r)/100;
        System.out.println("Simple interest is "+s);
    }
    public static void areaOfRectangle(double l,double b){
        double area=l*b;
        System.out.println("The area of rectangle is "+area);
    }
    public static void fac(int num){
        int fac=1;
        for(int i=1;i<=num;i++){
            fac=fac*i;
        }
        System.out.println("factorial is "+fac);
    }
    public static void main(String [] args){
        //prime  and composite
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(primeCheck(10));
        evenCheck(2);
        printTable(5);
        System.out.println(multiply3(2,3,4));
        interest(100000, 1.5, 1.5);
        areaOfRectangle(1,5);
        fac(1);
    }
    
}
