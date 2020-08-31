package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public class StoreDB {

    private static Connection con;

    public static ArrayList<Store> getAll() {
        ArrayList<Store> allStore = new ArrayList<>();
        String sql = "select * from Store_DE140022";
        con = ConnectDB.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1).trim();
                String name = rs.getString(2).trim();
                String address = rs.getString(3).trim();
                String phone = rs.getString(4).trim();
                allStore.add(new Store(id, name, address, phone));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(StoreDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allStore;
    }

    public static ArrayList<Store> getStoreByPhone(String phoneS) {
        ArrayList<Store> storeByPhone = new ArrayList<>();
        String sql = "select * from Store_DE140022 where Phone = '" + phoneS + "'";
        con = ConnectDB.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1).trim();
                String name = rs.getString(2).trim();
                String address = rs.getString(3).trim();
                String phone = rs.getString(4).trim();
                storeByPhone.add(new Store(id, name, address, phone));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(StoreDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return storeByPhone;
    }

    public static boolean newStore(Store store) {
        String sql = "insert into Store_DE140022 values(?, ?, ?, ?)";
        con = ConnectDB.getConnection();
        try {
            PreparedStatement pps = con.prepareStatement(sql);
            pps.setString(1, store.getStoreID());
            pps.setString(2, store.getStoreName());
            pps.setString(3, store.getAddress());
            pps.setString(4, store.getPhone());
            pps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StoreDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Store getStore(String id) {
        String sql = "select * from Store_DE140022 where Store_ID = '" + id + "'";
        con = ConnectDB.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String ids = rs.getString(1);
                String name = rs.getString(2);
                String add = rs.getString(3);
                String phone = rs.getString(4);
                return new Store(ids, name, add, phone);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
