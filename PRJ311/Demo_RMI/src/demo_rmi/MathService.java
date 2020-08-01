package demo_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @date Jul 10, 2020
 * @author Nguyen Xuan Nghiep
 */
public interface MathService extends Remote {

    double add(double a, double b) throws RemoteException;

    double subtrac(double a, double b) throws RemoteException;

    double multi(double a, double b) throws RemoteException;

    double div(double a, double b) throws RemoteException;
}
