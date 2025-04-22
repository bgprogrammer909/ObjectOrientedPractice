import java.util.Scanner;

public class Task22 {
    public static void main(String[] args){
        // Input a number and reverse it using a for loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number");
        int num=sc.nextInt();
        sc.close();

        String rev="";
        String numStr=String.valueOf(num);

        for(int i=numStr.length()-1;i>=0;i--){
            char digit=numStr.charAt(i);
            rev+=digit;
        }
        System.out.println("The reverse is "+ rev);
    }
    
}
