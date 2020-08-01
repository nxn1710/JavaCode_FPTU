package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ConnectDB {
    private static Connection con;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PRJ311_DE140022;integratedSecurity=true;");
        } catch (Exception e) {
        }
        return con;
    }

}
