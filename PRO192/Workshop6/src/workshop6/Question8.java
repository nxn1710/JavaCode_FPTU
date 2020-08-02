package workshop6;


import java.util.Scanner;

/**
 * @date Mar 6, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Question8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Enter string: ");
        string = scanner.nextLine();
        int why = string.indexOf("why");
        int well = string.indexOf("well");
        int me = string.indexOf("me");
        int countW = 0;
        int you;
        int cYou = 0;
        System.out.println("a. ");
        if (why != -1) {
            System.out.println("Your string has \"why\"");
        } else if (well != -1) {
            System.out.println("Your string has \"well\"");
        } else if (me != -1) {
            System.out.println("Your string has \"me\"");
        } else {
            System.out.println("Your string dont has \"why, well, me\"");
        }
        you = string.indexOf("you");
        while (you != -1) {
            cYou++;
            string = string.substring(you + 1);
            you = string.indexOf("you");
        }
        System.out.println("b. ");
        System.out.println("\"you\" appear in your string " + cYou + " time");
        System.out.println("c. ");
        String words[] = string.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        System.out.println(capitalizeWord);
        System.out.println("d. ");
        System.out.println("e. ");
        String[] word = string.split(" ", 5);
        for (String word1 : word) {
            countW++;
            System.out.print(word1 + " ");
        }
        System.out.println("\ng. ");
        System.out.println("The string has " + countW + " word");
        System.out.println("h. ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println("\ni. ");
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
        System.out.println("j. ");
        StringBuilder replace = null;
        stringBuilder = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                replace = stringBuilder.replace(i, i + 1, "A");
            }
            if (string.charAt(i) == 'b') {
                replace = stringBuilder = stringBuilder.replace(i, i+1, "B");
            }
        }
        System.out.println(replace);
        System.out.println("k. ");
        int countUpper = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                countUpper++;
            }
        }
        System.out.println("The string has " + countUpper + " uppercase character");
    }
}
