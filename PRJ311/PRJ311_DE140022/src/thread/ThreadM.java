package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ThreadM extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread M " + i);
            try {
                ThreadM.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }
}
