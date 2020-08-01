package fulib.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class BookDB implements DatabaseInfo {
    //--------------------------------------------------------------------

    public static Book getBook(String bid) {
        Book book = null;
        String sql = "Select * from Books where BookID ='" + bid + "';";
        Connection con = ConnectDatabase.getConnect();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String key = rs.getString(5);
                book = new Book(id, title, author, category, key);
                con.close();
            }
            return book;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    //--------------------------------------------------------------------   

    public static ArrayList<Book> searchByCategory(String cat) {
        ArrayList<Book> listBook = new ArrayList<>();
        Connection con = ConnectDatabase.getConnect();
        String sql = "Select * from Books where Category LIKE N'%" + cat + "%';";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String key = rs.getString(5);
                listBook.add(new Book(id, title, author, category, key));
            }
            con.close();
            return listBook;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> listBook = new ArrayList<>();
        Connection con = ConnectDatabase.getConnect();
        String sql = "Select * from Books where Author LIKE N'%" + author + "%';";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String authors = rs.getString(3);
                String category = rs.getString(4);
                String key = rs.getString(5);
                listBook.add(new Book(id, title, authors, category, key));
            }
            con.close();
            return listBook;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //-------------------------------------------------------------------- 

    public static ArrayList<Book> searchByKeyword(String key) {
        ArrayList<Book> listBook = new ArrayList<>();
        Connection con = ConnectDatabase.getConnect();
        String sql = "Select * from Books where Keyword = '" + key + "';";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                listBook.add(new Book(id, title, author, category, keyword));
            }
            con.close();
            return listBook;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //--------------------------------------------------------------------------
    public static ArrayList<Book> getAll() {
        ArrayList<Book> listBook = new ArrayList<>();
        Connection con = ConnectDatabase.getConnect();
        String sql = "Select * from Books";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                listBook.add(new Book(id, title, author, category, keyword));
            }
            con.close();
            return listBook;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //--------------------------------------------------------------------   

    public static boolean addNewBook(Book b) {
        Connection con = ConnectDatabase.getConnect();
        String sql = "INSERT INTO Books VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, b.getBookID());
            pr.setString(2, b.getTitle());
            pr.setString(3, b.getAuthor());
            pr.setString(4, b.getCategory());
            pr.setString(5, b.getKeyword());
            pr.execute();
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateBook(Book b) {
        Connection con = ConnectDatabase.getConnect();
        String sql = "UPDATE Books SET BookID=?, Title=?, Author=?, Category =?, Keyword =? WHERE BookID=?";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, b.getBookID());
            pr.setString(2, b.getTitle());
            pr.setString(3, b.getAuthor());
            pr.setString(4, b.getCategory());
            pr.setString(5, b.getKeyword());
            pr.setString(6, b.getBookID());
            pr.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //--------------------------------------------------------------------   

    public static boolean deleteBook(Book b) {
        Connection con = ConnectDatabase.getConnect();
        String sql = "DELETE FROM Books WHERE BookID = ?";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, b.getBookID());
            pr.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //--------------------------------------------------------------------   

    public static ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> list = new ArrayList<>();
        Connection con = ConnectDatabase.getConnect();
        String sql = "Select * from Books where Title LIKE N'%" + title + "%';";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title1 = rs.getString(2);
                String author = rs.getString(3);
                String category = rs.getString(4);
                String keyword = rs.getString(5);
                list.add(new Book(id, title1, author, category, keyword));
            }
            con.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //--------------------------------------------------------------------   
}
