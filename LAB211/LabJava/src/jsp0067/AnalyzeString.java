package jsp0067;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class AnalyzeString {

    private String str;
    private HashMap<String, ArrayList<Integer>> listNumber;
    private HashMap<String, String> listCharacter;

    public AnalyzeString() {
    }

    public AnalyzeString(String str) {
        this.str = str;
        listNumber = new HashMap<>();
        listCharacter = new HashMap<>();
    }

    public void splitNumber() {
        ArrayList<Integer> allNum = new ArrayList<>();
        String number = str.replaceAll("\\D+", ",");
        if (number.charAt(0) == ',') {
            number = number.substring(1);
        }
        if (number.charAt(number.length() - 1) == ',') {
            number = number.substring(0, number.length() - 1);
        }
        String num[] = new String[number.length()];
        num = number.split(",");
        for (String n : num) {
            allNum.add(Integer.parseInt(n));
        }
        ArrayList<Integer> squareNum = new ArrayList<>();
        ArrayList<Integer> oddNum = new ArrayList<>();
        ArrayList<Integer> evenNum = new ArrayList<>();
        for (int n : allNum) {
            if (checkSquareNumber(n)) {
                squareNum.add(n);
            }
            if (n % 2 == 0) {
                evenNum.add(n);
            }
            if (n % 2 != 0) {
                oddNum.add(n);
            }
        }
        listNumber.put("Perfect Square Number", squareNum);
        listNumber.put("Odd number", oddNum);
        listNumber.put("EvenNumber", evenNum);
        listNumber.put("All number", allNum);
    }

    public void splitCharacter() {
        String chars = str.replaceAll("[0-9]", "");
        String upper = str.replaceAll("\\W|[0-9]|[a-z]", "");
        String lower = str.replaceAll("\\W|[0-9]|[A-Z]", "");
        String spec = str.replaceAll("\\w", "");
        listCharacter.put("All Characer: ", chars);
        listCharacter.put("Uppercase Character: ", upper);
        listCharacter.put("Lowercase Character: ", lower);
        listCharacter.put("Special Characer: ", spec);
    }

    public boolean checkSquareNumber(int n) {
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("-----Number-----");
        for (Map.Entry m : listNumber.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("-----String-----");
        for (Map.Entry m : listCharacter.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        AnalyzeString as = new AnalyzeString(scanner.nextLine());
        as.splitCharacter();
        as.splitNumber();
        as.display();
    }
}
