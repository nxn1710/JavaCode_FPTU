package assignment_1;

/**
 * @date Jun 6, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Menu {

    public static int Main() {
        System.out.println("--------Menu--------");
        System.out.println("1. Manager Train");
        System.out.println("2. Manager Customer");
        System.out.println("3. Manager Booking");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return Validation.checkInputInt();
    }

    public static int Train() {
        System.out.println("--------Train Management--------");
        System.out.println("0. Back to main menu");
        System.out.println("1. Load train list from file");
        System.out.println("2. Add a train");
        System.out.println("3. Display train list");
        System.out.println("4. Save train list to file");
        System.out.println("5. Search train by tcode");
        System.out.println("6. Delete train by tcode");
        System.out.println("7. Sort train list by tcode");
        System.out.println("8. Add train after position");
        System.out.println("9. Delete the train before the train having tcode = xCode");
        System.out.print("Enter your choice: ");
        return Validation.checkInputInt();
    }

    public static int Customer() {
        System.out.println("--------Customer Management--------");
        System.out.println("0. Back to main menu");
        System.out.println("1. Load customer list from file");
        System.out.println("2. Add a customer");
        System.out.println("3. Display customer list");
        System.out.println("4. Save customer list to file");
        System.out.println("5. Search customer by ccode");
        System.out.println("6. Delete customer by ccode");
        System.out.print("Enter your choice: ");
        return Validation.checkInputInt();
    }

    public static int Booking() {
        System.out.println("--------Booking Management--------");
        System.out.println("0. Back to main menu");
        System.out.println("1. Add a booking");
        System.out.println("2. Display booking list");
        System.out.println("3. Sort by tcode + ccode");
        System.out.print("Enter your choice: ");
        return Validation.checkInputInt();
    }
}
