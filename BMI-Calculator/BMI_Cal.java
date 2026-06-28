import java.util.Scanner;

public class BMI_Cal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("BMI Calculator");

        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } 
        else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } 
        else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } 
        else {
            System.out.println("Category: Obese");
        }

        input.close();
    }
}