package fulib.model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDB implements DatabaseInfo {
    //-------------------------------------------------------------------------------

    public static boolean updateUser(User s) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Update Users set fullName=?,password=?,email=?,status=?, userright=? where userid=?");
            stmt.setString(1, s.getFullName());
            stmt.setString(2, s.getPassword());
            stmt.setString(3, s.getEmail());
            stmt.setString(4, s.getStatus());
            stmt.setInt(5, s.getUserRight());
            stmt.setString(6, s.getUserID());
            int rc = stmt.executeUpdate();
            con.close();
            return rc == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //-------------------------------------------------------------------------------   

    public static int doBookOrder(String uid, String bid) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            CallableStatement stmt = con.prepareCall("{call MuonSach(?,?,?)}");
            stmt.setString(1, bid);
            stmt.setString(2, uid);
            stmt.registerOutParameter(3, 5);
            stmt.execute();
            int logid = stmt.getInt(3);
            con.close();
            return logid;
        } catch (Exception ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    //-------------------------------------------------------------------------------   

    public static User getUser(String uid) {
        User s = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select fullName,email,password,status,userright from Users where userID='" + uid + "'");
            if (rs.next()) {
                String fullName = rs.getString(1);
                String email = rs.getString(2);
                String password = rs.getString(3);
                String status = rs.getString(4);
                int userRight = rs.getInt(5);
                String userID = uid;
                s = new User(userID, fullName, email, password, status, userRight);
            }
            con.close();
            return s;
        } catch (Exception ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    //--------------------------------------------------------------------------------------------

    public static String addNewUser(User s) {
        Connection con = ConnectDatabase.getConnect();
        String sql = "INSERT INTO Users VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, s.getUserID());
            pr.setString(2, s.getFullName());
            pr.setString(3, s.getEmail());
            pr.setString(4, s.getPassword());
            pr.setString(5, s.getStatus());
            pr.setInt(6, s.getUserRight());
            pr.execute();
            con.close();
            return "Success add user";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Failed add";
    }
        public static String deleteUser(User user) {
        Connection con = ConnectDatabase.getConnect();
        String sql = "DELETE FROM Users WHERE UserID = ?";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, user.getUserID());
            pr.execute();
            con.close();
            return "Success delete user";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Failed";
    }

    //--------------------------------------------------------------------------------------------   
}
