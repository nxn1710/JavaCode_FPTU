package thread;

/**
 * @date Jun 19, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ThreadB implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B" + i);
        }
    }
    
}
