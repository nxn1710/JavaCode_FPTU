package thread;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ThreadMain {
    public static void main(String[] args) {
        ThreadM threadM = new ThreadM();
        ThreadN threadN = new ThreadN();
        threadM.start();
        threadN.start();
    }
}
