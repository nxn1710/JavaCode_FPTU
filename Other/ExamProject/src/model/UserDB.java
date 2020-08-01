package model;

import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jul 20, 2020
 * @author Nguyen Xuan Nghiep
 */
public class UserDB {

    private static Connection con;

    public static User signIn(String id, String pass) {
        con = Connect.getConnect();
        String sql = "select * from account where id = ? and pass = ?";
        try {
            PreparedStatement pps = con.prepareStatement(sql);
            pps.setString(1, id);
            pps.setString(2, pass);
            ResultSet rs = pps.executeQuery();
            if (rs.next()) {
                String name = rs.getString(1);
                String ids = rs.getString(2);
                String passs = rs.getString(3);
                String classes = rs.getString(4);
                User u = new User(name, ids, passs, classes);
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
