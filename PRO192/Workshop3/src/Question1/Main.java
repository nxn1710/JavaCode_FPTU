package Question1;

import java.util.Scanner;

/**
 * @date Feb 2, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, num1 , num2, den1, den2;
        System.out.print("Numerator fraction 1: ");
        num1 = scanner.nextInt();
        System.out.print("Denominator fraction 1: ");
        den1 = scanner.nextInt();
        System.out.print("Numerator fraction 2: ");
        num2 = scanner.nextInt();
        System.out.print("Denominator fraction 1: ");
        den2 = scanner.nextInt();
        Fraction fraction1 = new Fraction(num1, den1);
        Fraction fraction2 = new Fraction(num2, den2);
        Fraction result = new Fraction();
        System.out.println("\tMENU");
        System.out.println("1. Add two fraction\n2. Subtract two fraction");
        System.out.println("3. Multi two fraction\n4. Divide two fraction");
        System.out.print("Your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1: 
                System.out.print(fraction1.toString() + " + " 
                        + fraction2.toString() + " = ");
                result.add(fraction1, fraction2);
                break;
            case 2:
                System.out.print(fraction1.toString() + " - " 
                        + fraction2.toString() + " = ");
                result.subtract(fraction1, fraction2);
                break;
            case 3:
                System.out.print(fraction1.toString() + " * " 
                        + fraction2.toString() + " = ");
                result.multiply(fraction1, fraction2);
                break;
            case 4:
                System.out.print(fraction1.toString() + " / " 
                        + fraction2.toString() + " = ");
                result.divide(fraction1, fraction2);
                break;
            default:
                System.out.println("NO SUPPORT");
        }
    }
}
