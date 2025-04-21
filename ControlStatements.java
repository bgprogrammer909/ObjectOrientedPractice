import java.util.Scanner;
public class ControlStatements {
    public static void main(String[] args) {
            int age=18;
            //this is simple 
        if (age<18) {
            System.out.println("you can vote");
        } else {
            System.out.println("no you can't vote");
        }
        // this is else if 
        if (age<21) {
            System.out.println("you are old");
        } else if (age>=18) {
            System.out.println("you are not old but no young");
        } else {
            System.out.println("you are a child");
        }
        // nested if
        Scanner sc= new Scanner(System.in);
        System.out.println("COMPARE 3 TO SEE HIGHEST");
        System.out.println("Enter first no");
        int a=sc.nextInt();
        System.out.println("Enter second no");
        int b=sc.nextInt();
        System.out.println("Enter third no");
        int c=sc.nextInt();
        if (a>b){
            if (a>c){
                System.out.println(a+" is highest");
            }
        } else {
            if (b>c){
                System.out.println(b+" is highest");
            }else{
                System.out.println(c+" is the highest");
            }
        }
        sc.close();
        //switch case
        String  day="Saturday";
        switch (day){
            case "Sunday":
                System.out.println("FIirst day");
                break;
            case "Monday":
                System.out.println("Second day");
                break;
            default:
                System.out.println("IDK");
                break;
        }
    }
}
