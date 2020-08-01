package workshop_rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Server {

    public static void main(String[] args) {
        String host = "rmi://localhost:8080/EmployeeManager";
        EmployeeImp emp;
        try {
            emp = new EmployeeImp();
            LocateRegistry.createRegistry(8080);
            Naming.rebind(host, emp);
            System.out.println("Server is opened, waitting for client");
        } catch (MalformedURLException | RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
