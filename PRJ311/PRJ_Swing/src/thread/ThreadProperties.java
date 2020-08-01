package thread;

/**
 * @date Jun 19, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ThreadProperties extends Thread{

    public ThreadProperties(String threadname) {
        super(threadname);
        this.start();
    }

    @Override
    public void run() {
        showProperties(this);
    }
    
    public static void showProperties(Thread t) {
        System.out.println("I'm the " + t.getName() + " thread");
        System.out.println("My ID: " + t.getId());
        System.out.println("My name: " + t.getName());
        System.out.println("My priority: " + t.getPriority());
        System.out.println("My state: " + t.getState());
        System.out.println("I'm a deamon: " + t.isDaemon());
        System.out.println("I'm alive: " + t.isAlive());
    }
    
}
