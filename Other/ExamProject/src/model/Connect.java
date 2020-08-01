package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jul 20, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Connect {

    private static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dUrl = "jdbc:sqlserver://localhost:1433;databaseName=Exam;integratedSecurity=true;";
    private static String uname = "se";
    private static String pass = "se";
    private static Connection con = null;
    
    public static Connection getConnect() {
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dUrl, uname, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("fail");
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    public static void main(String[] args) {
            System.out.println(getConnect());
    }
}
