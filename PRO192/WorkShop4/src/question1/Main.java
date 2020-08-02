package question1;

import java.util.Scanner;

/**
 * @date Feb 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1, side2, side3;
        System.out.print("Length of the first side = ");
        side1 = scanner.nextInt();
        System.out.print("Length of the second side = ");
        side2 = scanner.nextInt();
        System.out.print("Length of the third side = ");
        side3 = scanner.nextInt();
        Triangle triangle = new Triangle(side1, side2, side3);
        if (triangle.checkTriangle() == false) {
            System.out.println("This is not a triangle");
        } else { 
            System.out.println("This is a triangle");
            System.out.println("Perimeter = " + triangle.perimeter());
            System.out.println("Area = " + triangle.area());
            triangle.kindTriangle();
        }
    }
}
