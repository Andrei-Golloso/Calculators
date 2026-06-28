import java.util.Scanner;

public class Hypotenuse_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.print("Enter the side of x: ");
        x = sc.nextDouble();
        System.out.print("Enter the side of y: ");
        y = sc.nextDouble();    
        
        z = Math.sqrt((x*x)+(y*y));

        System.out.print("The hypotenuse is: " + z);
        sc.close();
    }
}