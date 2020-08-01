package deadlock;

/**
 * @date Jun 26, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Test {

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread1 a = new Thread1();
        Thread2 b = new Thread2();
        a.start();
        b.start();
        String o = "123";
        System.out.println(Integer.parseInt(String.valueOf(o.charAt(0))));
    }

    private static class Thread1 extends Thread {

        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1 holding lock 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 1 waiting lock 2");
                synchronized(lock2) {
                    System.out.println("Thread 1 holding lock 1 & 2");
                }
            }
            
        }

    }
    private static class Thread2 extends Thread {

        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2 holding lock 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 2 waiting lock 1");
                synchronized(lock1) {
                    System.out.println("Thread 2 holding lock 1 & 2");
                }
            }
        }

    }
}
