package workshop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class EmployeeImp extends UnicastRemoteObject implements IEmployee {

    private static Connection con;

    public EmployeeImp() throws RemoteException {

    }

    @Override
    public ArrayList<Employee> getAllEmployee() throws RemoteException {
        return EmployeeDB.getAllEmployee();
    }

    @Override
    public boolean addEmployee(Employee emp) throws RemoteException {
        return EmployeeDB.addEmployee(emp);
    }

    @Override
    public boolean editEmployee(Employee emp) throws RemoteException {
        return EmployeeDB.editEmployee(emp);
    }

    @Override
    public boolean removeEmployee(String id) throws RemoteException {
        return EmployeeDB.removeEmployee(id);
    }

    @Override
    public Employee getEmployee(String id) throws RemoteException {
        return EmployeeDB.getEmployee(id);
    }

}
