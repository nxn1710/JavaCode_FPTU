package jsp0084;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class JSP0084 {

    private BigInteger num1;
    private BigInteger num2;
    private static Scanner scanner = new Scanner(System.in);

    public JSP0084() {
    }

    public JSP0084(BigInteger num1, BigInteger num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void input() {
        System.out.print("Enter number 1: ");
        num1 = new BigInteger(scanner.nextLine());
        System.out.print("Enter number 2: ");
        num2 = new BigInteger(scanner.nextLine());
    }

    public BigInteger getNum1() {
        return num1;
    }

    public void setNum1(BigInteger num1) {
        this.num1 = num1;
    }

    public BigInteger getNum2() {
        return num2;
    }

    public void setNum2(BigInteger num2) {
        this.num2 = num2;
    }

    public void displayMulti() {
        System.out.println("multiply of two integer: " + num1.multiply(num2));
    }

    public static void main(String[] args) {
        JSP0084 main = new JSP0084();
        main.input();
        main.displayMulti();
    }
}
