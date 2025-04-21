import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
        //max between 3 numbers
        // int a=1,b=2,c=3;
        //     if (a>b && a>c){
        //         System.out.println(a+" is the highest");
        //     }else if (b>c && b>a){
        //         System.out.println(b+" is the highest");
        //     }else if (c>b && c>a){
        //         System.out.println(c+" is the highest");
        //     }else {
        //         System.out.println("INVALID input");
        //     }
        // //whether negative positive
        //     if (a==0){
        //         System.out.println(a+" is zero");
        //     }else if (a>0){
        //         System.out.println(a+" is positive");
        //     }else if (a<0){
        //         System.out.println(c+" is negative");
        //     }
        // //divisible by 5 and 11 or not 
        //     if (a%11==0 && a%5==0){
        //         System.out.println(a+" is divisible by 5 and 11");
        //     }else{
        //         System.out.println(a+" is not divisible by 5 and 11");
        //     }
        // //even or odd
        //     if (a==0){
        //         System.out.println(a+" is zero");
        //     }else if (a%2==0){
        //         System.out.println(a+" is even");
        //     }else{
        //         System.out.println(a+"it is odd");
        //     }
        // //check if leap year or not
        // int year=2000;
        //     if (year%4==0 && (year%100!=0 || year%400==0)){
        //         System.out.println("It is a leap year");
        //     }else{
        //         System.out.println("not a leap year");
        //     }
        // //check if voewl or consonant
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a character");
        // char inp=sc.next().charAt(0); 
        // inp= Character.toUpperCase(inp);
        // if (inp=='a' ||inp=='e' ||inp=='i' ||inp=='o' ||inp=='u'){
        //     System.out.println("it is vowel");
        // }else{
        //     System.out.println("it is consonant");
        // }
        // sc.close()
    //switch

    //input and take grade and change to gpa
    System.out.println("Enter grade");
    Scanner sc=new Scanner(System.in);
    char grade=sc.next().charAt(0);
    grade=Character.toUpperCase(grade);
    switch (grade){
        case 'A':
            System.out.println("4.0");
            break;
        case 'B':
            System.out.println("3.0");
            break;
        case 'C':
            System.out.println("2.0");
            break;
        case 'D':
            System.out.println("1.0");
            break;
        case 'F':
            System.out.println("failed");
            break;    
        default:
            System.out.println("invalid input");
    }
}
}
