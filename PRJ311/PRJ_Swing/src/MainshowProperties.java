
import thread.ThreadProperties;

/**
 * @date Jun 19, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MainshowProperties {
    public static void main(String[] args) {
        Thread a = Thread.currentThread();
        ThreadProperties.showProperties(a);
        ThreadProperties b = new ThreadProperties("Thread 2");
        ThreadProperties c = new ThreadProperties("Thread 3");
    }
}
