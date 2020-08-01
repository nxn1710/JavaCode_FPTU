package workshop_rmi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @date Jul 16, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ConnectDB {

    public static Connection con = null;
    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
    public static String userDB = "sa";
    public static String passDB = "abcd";

    public static Connection getConnect() {
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dbURL, userDB, passDB);
        } catch (Exception e) {
            System.out.println("Connect Fail");
            e.printStackTrace();
        }
        return con;
    }
    
    public static void main(String[] args) {
        Connection c = getConnect();
    }
}
