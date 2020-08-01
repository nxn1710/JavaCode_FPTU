package workshop_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public interface IEmployee extends Remote {


    public ArrayList<Employee> getAllEmployee() throws RemoteException;

    public Employee getEmployee(String id) throws RemoteException;
    
    public boolean addEmployee(Employee emp) throws RemoteException;

    public boolean editEmployee(Employee emp) throws RemoteException;

    public boolean removeEmployee(String id) throws RemoteException;

}
