package Question2;

import java.util.Scanner;

/**
 * @date Feb 2, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Atom {

    private int number;
    private String symbol;
    private String fullname;
    private double weight;

    public Atom() {
    }

    public Atom(int number, String symbol, String fullname, double weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter atomic number: ");
        this.number = scanner.nextInt();
        if (this.number != 0) {
            System.out.print("Enter symbol: ");
            this.symbol = scanner.next();
            scanner.nextLine();
            System.out.print("Enter full name: ");
            this.fullname = scanner.nextLine();
            System.out.print("Enter atomic weight: ");
            this.weight = scanner.nextDouble();
            System.out.println("");
        }
    }

    void display() {
        System.out.println(number + "\t" + symbol + "\t" + fullname + "\t" + weight);
    }
}
