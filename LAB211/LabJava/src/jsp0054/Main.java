package jsp0054;

import java.util.Scanner;

/**
 * @date Jun 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static int Menu() {
        System.out.println("===== CONTACT PROGRAM =====");
        System.out.println("1. Add a contact");
        System.out.println("2. Display all contact");
        System.out.println("3. Remove a contact");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int choice, id = 0;
        ContactList contactList = new ContactList();
        do {
            choice = Menu();
            switch (choice) {
                case 1:
                    contactList.addContact(++id);
                    break;
                case 2:
                    contactList.display();
                    break;
                case 3:
                    contactList.remove();
                    break;
                case 4:
                    break;

            }
        } while (choice != 4);
    }
}
