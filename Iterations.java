import java.util.Scanner;
public class Iterations {
    public static void main(String[] args) {
        //inital;check;increament/decreament
        // for(int i=0;i<10;i++){
        // //statements to repeat
        //     System.out.println(i);
        // }
        // for(int a=1;a<10;a++){
        //     for(int b=0;a>=b;b++){
        //         System.out.println(b);

        //     } 
        // }
        // //multipication
        // for(int i=1;i<=10;i++){
        //     System.out.println();
        //     System.out.println("the multipication table of "+i);
        //     System.out.println();
        //     for(int j=1;j<=10;j++){
        //         System.out.println(i+"x"+j+"="+i*j);
        //     }
        // }
        //take input from user and print sum from 1 to tajt number
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a number");
        // int a=sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=a;i++){
        //     sum+=i;
        // }
        // System.out.println("the sum from 1 to given number is: "+sum);
        //even number from 1 to 100
        // for(int i=1;i<=100;i++){
        //     if (i%2==0){
        //         System.out.println(i);
        //     }
        // }
        //take string and reverse it
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String a=s.next();
        //string must be initaialized
        String b="";
        int length=a.length();
        for(int i=length-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println(b);
    }
    
}
