import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        // Take a character input and use switch to display if it is a vowel (a, e, i, o, u).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char ch = sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        switch (ch) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break; 
            default:
                System.out.println("composite");
                break;
        }

        sc.close();

    }
    
}
