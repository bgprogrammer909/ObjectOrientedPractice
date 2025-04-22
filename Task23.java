import java.util.Scanner;
public class Task23 {
    public static void main(String[] args){
        // Take a number and check whether it is a palindrome or not using if-else and loop.
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
        System.out.println(rev);
        if (rev.equals(numStr)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindriome");
        }
    }
    
}
