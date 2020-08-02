package workshop6;

import java.util.Scanner;

/**
 * @date Mar 6, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Enter a string: ");
        string = scanner.nextLine();
        String[] word = string.split(" ", 5);
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i] + " ");
        }
        System.out.println("");
    }
}
