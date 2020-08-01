package javaapplication25;

/**
 * @date May 22, 2020
 * @author Nguyen Xuan Nghiep
 */
import java.sql.*;

public class DatabaseInfo {
//
    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FULib;integratedSecurity=true;";
    public static String userDB = "sa";
    public static String passDB = "123";

    public DatabaseInfo() {
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driverName);
//            conn = DriverManager.getConnection(dbURL);
            conn = DriverManager.getConnection(dbURL, userDB, passDB);

            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Connect Fail");
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void getBooks() {
        try {
            Connection conn = getConnection();
            String sql = "select * from books";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }
            conn.close();
            
        } catch (Exception e) {
            System.out.println("Get book error");
            e.printStackTrace();
        }
    }
    
    public static void insert() { 
        Connection conn = getConnection();
        try {
            
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        getBooks();
    }
    
}
