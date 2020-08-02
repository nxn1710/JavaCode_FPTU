package workshop5;

import java.util.Scanner;

/**
 * @date Feb 28, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Workshop5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, area, i = 0;
        String number, countryCode;
        PhoneNumber phoneNumber[] = new PhoneNumber[1000];
        System.out.println("Enter list of number");
        System.out.println("--------------------");
        do {
            System.out.println("Type of number ? ");
            System.out.println("(1- Local phone, 2- Inter phone number, 0- Exit)");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter area Code: ");
                    area = scanner.nextInt();
                    System.out.print("Enter number: ");
                    number = scanner.next();
                    phoneNumber[i] = new PhoneNumber(area, number);
                    i++;
                    break;
                case 2:
                    System.out.print("Enter country code: ");
                    countryCode = scanner.next();
                    System.out.print("Enter area Code: ");
                    area = scanner.nextInt();
                    System.out.print("Enter number: ");
                    number = scanner.next();
                    phoneNumber[i] = new IntPhoneNumber(countryCode, area, number);
                    i++;
                    break;
            }
        } while (choice != 0);
        System.out.println("List of phone number");
        System.out.println("--------------------");
        for (int j = 0; j < i; j++) {
            phoneNumber[j].display();
        }
    }

}
