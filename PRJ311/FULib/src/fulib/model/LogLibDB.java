package fulib.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class LogLibDB {
    //---------------------------------------------------------------------------------------

    public static LogLib getLog(int logID) {
        LogLib log;
        String sql = "Select * from LogLibs where LogID ='" + logID + "';";
        Connection con = ConnectDatabase.getConnect();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                String userId = rs.getString(1);
                String bookId = rs.getString(2);
                Date ngayDat = rs.getDate(3);
                Date ngayMuon = rs.getDate(4);
                Date ngayPTra = rs.getDate(5);
                Date ngayTra = rs.getDate(6);
                String manv = rs.getString(7);
                log = new LogLib(userId, bookId, ngayDat, ngayMuon, ngayPTra, ngayTra, manv, logID);
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //---------------------------------------------------------------------------------------

    public static void updateLog(LogLib log) {
        Connection con = ConnectDatabase.getConnect();
        String sql = "Update LogLibs SET UserID =?, BookID =?, NgayDat =?, NgayMuon =?, NgayPtra =?,"
                + " NgayTra =?, MaNV =? Where LogID=?";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, log.getUid());
            pr.setString(2, log.getBookid());
            pr.setDate(3, log.getNgayDat());
            pr.setDate(4, log.getNgayMuon());
            pr.setDate(5, log.getNgayPTra());
            pr.setDate(6, log.getNgayTra());
            pr.setString(7, log.getManv());
            pr.setInt(8, log.getLogid());
            pr.execute();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //---------------------------------------------------------------------------------------

    public static int writeLog(LogLib log) {
        Connection con = ConnectDatabase.getConnect();
        String sql = "INSERT INTO LogLibs VALUES (?,?,?,?,?,?,?,?)";
        System.out.println(log.getUid());
        System.out.println(log.getNgayDat());
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, log.getUid());
            pr.setString(2, log.getBookid());
            pr.setDate(3, log.getNgayDat());
            pr.setDate(4, log.getNgayMuon());
            pr.setDate(5, log.getNgayPTra());
            pr.setDate(6, log.getNgayTra());
            pr.setString(7, log.getManv());
            pr.setInt(8, log.getLogid());
            pr.executeQuery();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    //---------------------------------------------------------------------------------------   

    public static Vector<LogLib> viewLogByUser(String uid) {
        Vector<LogLib> listLog = new Vector<>();
        Connection con = ConnectDatabase.getConnect();
        String sql = "Select * from LogLibs where UserID ='" + uid + "';";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String userId = rs.getString(1);
                String bookId = rs.getString(2);
                Date ngayDat = rs.getDate(3);
                Date ngayMuon = rs.getDate(4);
                Date ngayPTra = rs.getDate(5);
                Date ngayTra = rs.getDate(6);
                String manv = rs.getString(7);
                int logID = rs.getInt(8);
                listLog.add(new LogLib(userId, bookId, ngayDat, ngayMuon, ngayPTra, ngayTra, manv, logID));
            }
            con.close();
            return listLog;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void deleteLog(int id) {
        Connection con = ConnectDatabase.getConnect();
        String sql = "DELETE FROM Loglibs WHERE LogID = ?";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setInt(1, id);
            pr.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //---------------------------------------------------------------------------------------   

    public static ArrayList<LogLib> getLogsByUser(String uid) {
        ArrayList<LogLib> listLog = new ArrayList<>();
        Connection con = ConnectDatabase.getConnect();
        String sql = "Select * from LogLibs where UserID ='" + uid + "';";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String userId = rs.getString(1);
                String bookId = rs.getString(2);
                Date ngayDat = rs.getDate(3);
                Date ngayMuon = rs.getDate(4);
                Date ngayPTra = rs.getDate(5);
                Date ngayTra = rs.getDate(6);
                String manv = rs.getString(7);
                int logID = rs.getInt(8);
                listLog.add(new LogLib(userId, bookId, ngayDat, ngayMuon, ngayPTra, ngayTra, manv, logID));
            }
            con.close();
            return listLog;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
