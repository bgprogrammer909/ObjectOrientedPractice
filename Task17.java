import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        // Write a program to input a number from 1 to 7 and display the day of the week using switch.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        int day=sc.nextInt();
        sc.close();
        switch(day){
            case 1:
            System.out.println("sunday");
            break;
            case 2:
            System.out.println("monday");
            break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thursday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 7:
            System.out.println("saturday");
            break;
            default:
            System.out.println("no day no life");
            break;
        }

    }
    
}

