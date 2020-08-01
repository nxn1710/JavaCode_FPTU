package jsp0059;

import java.io.IOException;
import java.util.Scanner;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        System.out.println("========== File Processing =========");
        System.out.println("1. Find person info");
        System.out.println("2. Copy Text to new file");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) throws IOException {
        int choice;
        Manager man = new Manager();
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Enter file Path: ");
                    String filePath = scanner.nextLine();
                    man.readFile(filePath);
                    System.out.print("Enter money: ");
                    double amount = scanner.nextDouble();
                    man.getInfo(amount);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter source: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter new file to copy: ");
                    String newFile = scanner.nextLine();
                    man.copyFile(source, newFile);
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }
}
