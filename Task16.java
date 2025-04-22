import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        // Take two numbers and an operator (+, -, *, /) and perform the operation using switch.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter an operator (+, -, *, /):");
        String op = sc.nextLine();

        switch (op) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }

        sc.close();
    }
}
