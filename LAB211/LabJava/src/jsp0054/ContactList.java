package jsp0054;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @date Jun 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ContactList {

    private ArrayList<Contact> list;
    private Scanner scanner = new Scanner(System.in);

    public ContactList() {
        list = new ArrayList<>();
    }

    public void addContact(int id) {
        Contact contact = new Contact();
        String phone;
        contact.setId(id);
        System.out.println("-------- Add a Contact --------");
        System.out.print("Enter First Name: ");
        contact.setFirstName(scanner.nextLine());
        System.out.print("Enter Last Name: ");
        contact.setLastName(scanner.nextLine());
        System.out.print("Enter Group: ");
        contact.setGroup(scanner.nextLine());
        System.out.print("Enter Address: ");
        contact.setAddress(scanner.nextLine());
        while (true) {
            System.out.print("Enter Phone: ");
            phone = scanner.nextLine();
            if (validatePhoneNumber(phone)) {
                contact.setPhone(phone);
                break;
            }
        }
        list.add(contact);
        System.out.println("Successful");
    }

    public void display() {
        System.out.println("-------------------------- Display all contact --------------------------");
        System.out.printf("%-5s%-20s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Name", "FirstName",
                "LastName", "Group", "Address", "Phone");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-5d", list.get(i).getId());
            System.out.printf("%-20s", list.get(i).getFirstName() + " " + list.get(i).getLastName());
            System.out.printf("%-15s", list.get(i).getFirstName());
            System.out.printf("%-15s", list.get(i).getLastName());
            System.out.printf("%-15s", list.get(i).getGroup());
            System.out.printf("%-15s", list.get(i).getAddress());
            System.out.printf("%-15s", list.get(i).getPhone());
            System.out.println("");
        }
    }

    public void remove() {
        int id;
        System.out.print("Enter ID: ");
        id = checkInputDigit();
        list.remove(id);
        System.out.println("Successful");
    }

    private boolean validatePhoneNumber(String phoneNo) {
        //validate phone numbers of format "1234567890"
        if (phoneNo.matches("\\d{10}")) {
            return true;
        } //validating phone number with -, . or spaces
        else if (phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) {
            return true;
        } //validating phone number with extension length from 3 to 5
        else if (phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) {
            return true;
        } //return false if nothing matches the input
        else {
            System.out.println("Please input Phone flow");
            System.out.println("• 1234567890");
            System.out.println("• 123-456-7890");
            System.out.println("• 123-456-7890 x1234");
            System.out.println("• 123-456-7890 ext1234");
            System.out.println("• 123.456.7890");
            System.out.println("• 123 456 7890");
            return false;
        }

    }

    private int checkInputDigit() {
        String result;
        int num;
        do {
            result = scanner.nextLine();
            try {
                num = Integer.parseInt(result.trim());
                return num;
            } catch (NumberFormatException e) {
                System.err.println("ID is digit");
                System.out.print("Enter ID: ");
            }
        } while (true);
    }

}
