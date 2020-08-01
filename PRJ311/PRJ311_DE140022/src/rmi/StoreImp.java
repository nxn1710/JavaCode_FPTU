package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import model.Store;
import model.StoreDB;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public class StoreImp extends UnicastRemoteObject implements IStore{

    public StoreImp() throws RemoteException{
    }
    
    @Override
    public ArrayList<Store> searchByPhone(String phone) throws RemoteException {
         return StoreDB.getStoreByPhone(phone);
    }
    
}
