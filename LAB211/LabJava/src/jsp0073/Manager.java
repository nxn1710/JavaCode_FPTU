package jsp0073;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @date Jun 24, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Manager {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Expense> listEx;

    public Manager() {
        listEx = new ArrayList<>();
    }

    public void addExpense(int id) {
        String date;
        Expense ex = new Expense();
        ex.setId(id);
        while (true) {
            System.out.print("Enter Date: ");
            date = scanner.nextLine();
            if (checkFormatDay(date)) {
                ex.setDate(date);
                break;
            } else {
                System.err.println("Please input Date in format like \"17-Oct-2000\"");
                System.out.println("Please enter again");
            }
        }
        System.out.print("Enter Amount of Money: ");
        ex.setMoney(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter Content: ");
        ex.setContent(scanner.nextLine());
        listEx.add(ex);
        System.out.println("Add success");
    }

    public void display() {
        double total = 0;
        System.out.println("----------Display all expenses----------");
        System.out.printf("%-5s%-15s%-10s%-10s\n", "ID", "Date", "Amount", "Content");
        for (Expense expense : listEx) {
            System.out.printf("%-5d", expense.getId());
            System.out.printf("%-15s", expense.getDate());
            System.out.printf("%-10.2f", expense.getMoney());
            System.out.printf("%-10s", expense.getContent());
            System.out.println("");
            total += expense.getMoney();
        }
        System.out.println("=> TOTAL = " + total);
    }

    public void delete() {
        System.out.println("-----Delete an expense-----");
        int id;
        System.out.print("Enter id: ");
        id = scanner.nextInt();
        for (Expense ex : listEx) {
            if (id == ex.getId()) {
                listEx.remove(ex);
                System.out.println("Delete success");
                return;
            }
        }
        System.out.println("Dont have that id in list");
    }

    public boolean checkFormatDay(String date) {
        return date.matches("^\\d{2}-\\w{3}-\\d{4}$");
    }

}
