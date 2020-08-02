package Question2;

/**
 * @date Feb 2, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) {
        Atom[] atom = new Atom[10];
        int i = 0;
        System.out.println(" Atomic Information");
        System.out.println("==================");
        while (i < 10) {
            atom[i] = new Atom();
            atom[i].accept();
            if (atom[i].getNumber() == 0) {
                break;
            }
            i++;
        }
        for (int j = 0; j < i; j++) {
            atom[j].display();
        }
    }
}
