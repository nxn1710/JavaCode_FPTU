package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(3030);
            Naming.rebind("rmi://localhost:3030/Store", new StoreImp());
            System.out.println("Server is opened in port 3030");
        } catch (Exception ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
