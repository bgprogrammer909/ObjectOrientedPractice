import java.util.Scanner;
public class w2_task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1
        int age=28;
        //condition? if true:if false
        
        String answer= (age>=18)? "you can vote":"you can't vote"; 
        System.out.println(answer);

        System.out.println((age>=100)? "you can vote":"you can't vote");
        //2
        float principle=1.5f,interest,rate=18.5f, time=1.60f;
        interest=(principle*time*rate)/100;
        System.out.println(interest);
        //3
        System.out.println("Triangle");
        System.out.println("Enter height and breadth");
        double breadth=sc.nextDouble();
        double height=sc.nextDouble();
        System.out.println("area= "+ (double)(.5*height*breadth));
        
        System.out.println("cuboid");
        System.out.println("Enter height and breadth");
        double length=sc.nextDouble();
        double width=sc.nextDouble();
        double height1=sc.nextDouble();
        System.out.println("area= "+ (double)( length*width*height1));
        
        System.out.println("cube");
        System.out.println("Enter side");
        double side=sc.nextDouble();
        System.out.println("area= "+ (double)(side*side*side));
        System.out.println("enter two integers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("sum= "+ (a+b));
        sc.close();
        
    }
    
}
