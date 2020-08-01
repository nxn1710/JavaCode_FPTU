package jlp0022;

/**
 * @date Jul 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static int menu() {
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intership");
        System.out.println("4. Search");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return Validation.checkInputInt();
    }

    public static void main(String[] args) {
        int choice;
        Manager m = new Manager();
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    m.addCandidate(1);
                    break;
                case 2:
                    m.addCandidate(2);
                    break;
                case 3:
                    m.addCandidate(3);
                    break;
                case 4:
                    m.display();
                    System.out.println("Name: ");
                    m.search(Validation.checkInputString());
                    break;
            }
        } while (choice != 5);
    }
}
