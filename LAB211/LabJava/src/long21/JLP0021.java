package long21;

/**
 * @date Jun 10, 2020
 * @author Nguyen Xuan Nghiep
 */
public class JLP0021 {

    private static int menu() {
        System.out.println("1. Create a student");
        System.out.println("2. Find/sort");
        System.out.println("3. Update/delete");
        System.out.println("4. Report");
        System.out.println("5. Ext");
        System.out.print("Enter your choice: ");
        return Validation.checkInputInt();
    }

    public static void main(String[] args) {
        int choice;
        Manage man = new Manage();
        man.addTest();
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    man.create();
                    break;
                case 2:
                    man.findSort();
                    break;
                case 3:
                    man.updateOrDelete();
                    break;
                case 4:
                    man.report();
                    break;
            }
        } while (choice != 5);
    }
}
