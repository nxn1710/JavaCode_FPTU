package demo_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @date Jul 10, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Mathematician extends UnicastRemoteObject implements MathService {

    public Mathematician() throws RemoteException{

    }

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtrac(double a, double b) {
        return a-b;
    }

    @Override
    public double multi(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) {
        return a/b;
    }

}
