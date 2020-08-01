package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import model.Store;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public interface IStore extends Remote{
    ArrayList<Store> searchByPhone(String phone) throws RemoteException;
}
