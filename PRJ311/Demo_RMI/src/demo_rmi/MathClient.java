package demo_rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jul 10, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MathClient {

    static MathService stub;
    String serverName = "rmi://localhost:8080/Math";

    public MathClient() {
        try {
            stub = (MathService) Naming.lookup(serverName);
        } catch (MalformedURLException | NotBoundException | RemoteException ex) {
        }

    }

    public static void main(String[] args) throws RemoteException {
        Scanner scanner = new Scanner(System.in);
        MathClient mathClient = new MathClient();
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.println("Add = " + stub.add(a, b));
        System.out.println("Subtrac = " +stub.subtrac(a, b));
        System.out.println("Multi = " +stub.multi(a, b));
        System.out.println("Div = " +stub.div(a, b));
    }

}
