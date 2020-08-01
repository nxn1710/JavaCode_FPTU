package demo_rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * @date Jul 10, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Math {

    public static void main(String[] args) {
        String server = "rmi://localhost:8080/Math";
        Mathematician math;
        try {
            math = new Mathematician();
            LocateRegistry.createRegistry(8080);
            Naming.rebind(server, math);

            System.out.println("Service: " + server + " is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
