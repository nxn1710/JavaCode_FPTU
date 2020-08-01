package fulib.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class CategoryDB {

    private static Connection con;

    public CategoryDB() {
    }

    public static ArrayList<Category> getAllCategory() {
        ArrayList<Category> list = new ArrayList<>();
        String sql = "Select * from Category";
        con = ConnectDatabase.getConnect();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String catId = rs.getString(1);
                String catName = rs.getString(2);
                list.add(new Category(catId, catName));
            }
            con.close();
        } catch (SQLException ex) {
        }
        return list;
    }
}
