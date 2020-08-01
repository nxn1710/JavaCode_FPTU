package jsp0062;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @date Jul 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Test {

    String filePath;
    
    public Test() {
    }

    public Test(String filePath) {
        this.filePath = filePath;
    }

    public void splitPath() {
        String[] path = filePath.split("\\\\");
        System.out.println("Disk: " + path[0]);
        String file = path[path.length - 1];
        System.out.println("Extension: " + file.substring(file.indexOf('.') + 1));
        System.out.println("File name: " + file.substring(0, file.indexOf('.')));
        System.out.print("Path: ");
        for (int i = 0; i < path.length - 1; i++) {
            System.out.print(path[i]);
            //not print blackslash in last string
            if (i != path.length-2) {
                System.out.print("\\");
            }
        }
        System.out.println("");
        System.out.print("Folder: ");
        for (int i = 1; i < path.length - 1; i++) {
            System.out.print("[" + path[i] + "] ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter path file: ");
        String file = scanner.nextLine();
//        File f = new File(file);
//        if (f.isFile()) {
            Test test = new Test(file);
            test.splitPath();
//        } else {
//            System.out.println("Path is invalid");
//        }
    }
}
