package jsp0052;

import java.util.Scanner;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia\n"
                + "2. Display the information of country you've just input\n"
                + "3. Search the information of country by user-entered name\n"
                + "4. Display the information of countries sorted name in ascending order\n"
                + "5. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int choice;
        ManageEastAsiaCountries man = new ManageEastAsiaCountries();
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    man.add();
                    break;
                case 2:
                    man.display();
                    break;
                case 3:
                    man.search();
                    break;
                case 4:
                    man.displaySortName();
                    break;
            }
        } while (choice != 5);
    }
}
