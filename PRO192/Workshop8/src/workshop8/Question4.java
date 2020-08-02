package workshop8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * @date Mar 21, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String src, dest, filePath;
        System.out.print("Enter file name: ");
        src = scanner.nextLine();
        System.out.print("Enter folder name: ");
        dest = scanner.nextLine();
        filePath = (dest.concat("/")).concat(src);
        File source = new File(src);
        File file = new File(filePath);
        try {
            BufferedReader bf = new BufferedReader(new FileReader(source));
            BufferedWriter bw = new BufferedWriter(new FileWriter(file)); 
            String s;
            StringBuilder sb = new StringBuilder();
            while((s = bf.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
            s = sb.toString();
            bw.write(s);
            bw.close();
            bf.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
