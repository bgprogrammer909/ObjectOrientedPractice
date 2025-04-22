import java.util.Scanner;
public class Task20 {
    public static void main(String[] args) {
        // Input a number and check if it is a perfect square using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        sc.close();
        boolean val=true;
        for(int i=1;i<=num;i++){
            if (i*i==num){
               val=true;
               break;
            }else {
              val=false;
            }
        }
        if(val==true){
            System.out.println("It is perfect square");
        }else{
            System.out.println("It is not perfect square");
        }
    }
}
