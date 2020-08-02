package workshop8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @date Mar 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Question3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        String file, line;
        System.out.print("Enter file Name: ");
        file = scanner.nextLine();
        File fileO = new File(file);
        if (fileO.exists()) {
            BufferedReader bf = new BufferedReader(new FileReader(fileO));
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        } else {
            System.out.println("File doesn't exits");
        }
        
    }
}
