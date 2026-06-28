import java.util.Scanner;

public class Basic_cli_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nBASIC CALCULATOR:");
        System.out.println("[1] Addition (+)");
        System.out.println("[2] Subtraction (-)");
        System.out.println("[3] Multiplication (*)");
        System.out.println("[4] Division (/)");
        System.out.print("Select a operation: ");
        int choice = sc.nextInt();

        System.out.print("\nEnter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.printf("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.printf("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.printf("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("Result: " + num1 + " / " + num2 + " = " + result);   
                } else {
                System.out.printf("Error! Cannot divide by 0");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}
