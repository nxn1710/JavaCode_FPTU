package jsp0058;

import java.util.Scanner;

/**
 * @date Jul 22, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        System.out.println("========= Dictionary program =========");
        System.out.println("1. Add Word");
        System.out.println("2. Move to recycle bin");
        System.out.println("3. Translate");
        System.out.println("4. Clear recycle bin");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int choice;
        String eng, vnm;
        Dictionary dictionary = new Dictionary("src\\jsp0058\\dictionary.xlsx");
        do {
            dictionary.loadData();
            choice = menu();
            scanner.nextLine();
            switch (choice) {
                
                case 1:
                    System.out.print("English: ");
                    eng = scanner.nextLine();
                    System.out.print("Vietnamese: ");
                    vnm = scanner.nextLine();
                    dictionary.addnewWord(eng, vnm);
                    break;
                case 2:
                    System.out.print("English: ");
                    eng = scanner.nextLine();
                    int i = dictionary.getRow(eng);
                    dictionary.moveRecycleBin(i, eng);
                    break;
                case 3:
                    System.out.print("English: ");
                    eng = scanner.nextLine();
                    dictionary.search(eng);
                    break;
                case 4:
                    dictionary.clearRecycleBin();
                    break;

            }
        } while (choice != 5);
    }

}
