package jsp0062;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @date Jul 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=====Analysis Path Program=====");
        System.out.print("Please input Path: ");
        String filePath = scanner.nextLine();
        FilePath file = new FilePath(filePath);
        System.out.println("-----Result Analysis-----");
        System.out.println("Disk: " + file.getDisk());
        System.out.println("Extension: " + file.getExtension());
        System.out.println("File Name: " + file.getFileName());
        System.out.println("Path: " + file.getFilePath());
        System.out.print("Folder: ");
        file.getFolders();
    }
}
