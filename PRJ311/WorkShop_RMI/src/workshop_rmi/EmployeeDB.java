package workshop_rmi;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jul 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class EmployeeDB {

    private static Connection con;

    public static ArrayList<Employee> getAllEmployee() {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "select * from information";
        try {
            con = ConnectDB.getConnect();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String lastName = rs.getString(2);
                String firstName = rs.getString(3);
                String gender = rs.getString(4);
                String email = rs.getString(5);
                list.add(new Employee(id, lastName, firstName, gender.charAt(0), email));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static boolean addEmployee(Employee emp) {
        String sql = "insert into information values (?,?,?,?,?)";
        con = ConnectDB.getConnect();
        try {
            PreparedStatement pps = con.prepareStatement(sql);
            pps.setString(1, emp.getEmp_id());
            pps.setString(2, emp.getLastName());
            pps.setString(3, emp.getFirstName());
            pps.setString(4, String.valueOf(emp.getGender()));
            pps.setString(5, emp.getEmail());
            pps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeImp.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean editEmployee(Employee emp) {
        String sql = "Update information "
                + "set Emp_id = ?, Last_name = ?, First_name = ?, Gender = ?, email = ? "
                + "Where Emp_id = ?";

        con = ConnectDB.getConnect();
        try {
            PreparedStatement pps = con.prepareStatement(sql);
            pps.setString(1, emp.getEmp_id());
            pps.setString(2, emp.getLastName());
            pps.setString(3, emp.getFirstName());
            pps.setString(4, String.valueOf(emp.getGender()));
            pps.setString(5, emp.getEmail());
            pps.setString(6, emp.getEmp_id());
            pps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean removeEmployee(String id) {
        String sql = "delete from information where Emp_id = '" + id + "'";
        con = ConnectDB.getConnect();
        try {
            Statement s = con.createStatement();
            s.executeUpdate(sql);
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeImp.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Employee getEmployee(String id) {
        String sql = "select * from information where Emp_id = '" + id + "'";
        con = ConnectDB.getConnect();
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            Employee e = null;
            if (rs.next()) {
                String ids = rs.getString(1);
                String lastName = rs.getString(2);
                String firstName = rs.getString(3);
                char gender = rs.getString(4).charAt(0);
                String email = rs.getString(5);
                e = new Employee(ids, lastName, firstName, gender, email);
                con.close();
            }
            System.out.println(e);
            return e;
        } catch (Exception e) {
            return null;
        }
    }
}
