package thread;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ThreadN extends Thread{
    @Override
    public void run() {
        for (int i = 200; i > 100; i--) {
            System.out.println("Thread N " + i);
            try {
                ThreadN.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }
}
