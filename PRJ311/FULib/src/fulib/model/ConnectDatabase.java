package fulib.model;

import static fulib.model.DatabaseInfo.dbURL;
import static fulib.model.DatabaseInfo.passDB;
import static fulib.model.DatabaseInfo.userDB;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @date May 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class ConnectDatabase implements DatabaseInfo {

    public static Connection con = null;

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
}
