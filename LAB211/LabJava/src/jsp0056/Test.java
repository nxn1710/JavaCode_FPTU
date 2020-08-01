package jsp0056;

import java.util.Scanner;
import java.util.Stack;
public class Test{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
} 