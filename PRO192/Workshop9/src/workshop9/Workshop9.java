package workshop9;

import java.util.Scanner;

/**
 * @date Mar 22, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Workshop9 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        String input;
        char check;
        String ask;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a first side: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter a second side: ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter a third side: ");
                c = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(a, b, c);
                System.out.println("This is a right triangle");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            } catch (IllegalRightTriangleException exx) {
                System.out.println(exx.getMessage());
            }
            System.out.print("Continue? Y/N: ");
            ask = scanner.nextLine();
            check = ask.charAt(0);
            if (check == 'N' || check == 'n') {
                break;
            }
        }
    }

}
