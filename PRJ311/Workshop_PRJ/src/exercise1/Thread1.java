package exercise1;

import java.util.Scanner;

/**
 * @date Jul 5, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Thread1 extends Thread {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        boolean check;
        do {
            for (int i = 100; i >= 0; i--) {
                System.out.println(i);
                try {
                    Thread1.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.print("Do you want to continue or stop? (Y/N): ");
            check = scanner.nextLine().charAt(0) == 'Y';
        } while (check);

    }

    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
    }

}
