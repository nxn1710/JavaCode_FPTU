package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Store;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Client {

    static IStore stub;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            stub = (IStore) Naming.lookup("rmi://localhost:3030/Store");
        } catch (MalformedURLException | NotBoundException | RemoteException ex) {
            ex.printStackTrace();
        }
        String phone;
        while (true) {
            while (true) {
                System.out.print("Enter phone: ");
                phone = scanner.nextLine();
                if (phone.matches("\\d{10}")) {
                    break;
                } else {
                    System.out.println("Phone must be 10 digit");
                }
            }
            ArrayList<Store> storeByPhone = null;
            try {
                storeByPhone = stub.searchByPhone(phone);
            } catch (RemoteException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (!storeByPhone.isEmpty()) {
                for (Store s : storeByPhone) {
                    System.out.println(s);
                }
            } else {
                System.out.println("Cant not find any store by that phone");
            }
            System.out.print("Do you want to continue?: ");
            if (scanner.nextLine().charAt(0) == 'N') {
                break;
            }
        }
    }
}
