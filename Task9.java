import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        // Take marks of five subjects and calculate the total, percentage, and grade using if-else.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of math");
        float math=sc.nextFloat();
        System.out.println("Enter marks of computer");
        float com=sc.nextFloat();
        System.out.println("Enter marks of english");
        float eng=sc.nextFloat();
        System.out.println("Enter marks of nepali");
        float nep=sc.nextFloat();
        System.out.println("Enter marks of social");
        float soc=sc.nextFloat();
        sc.close();
        float total,percentage;
        total=((math+nep+eng+soc+com)/5);
        percentage=((total*100)/5);
        System.out.println("The total marks is "+total);
        System.out.println("The percentage is "+percentage);
        char grade;
        if (percentage>80){
            grade='A';
        }else if (percentage<80 && percentage>70){
            grade='B';
        }else if (percentage<70 && percentage>60){
            grade='C';
        }else if (percentage<60 && percentage>50){
            grade='D';
        }else if (percentage<50 && percentage>40){
            grade='E';
        }else {
            grade='F';
        }
        System.out.println("The grade is "+grade);

       
    }
    
}
