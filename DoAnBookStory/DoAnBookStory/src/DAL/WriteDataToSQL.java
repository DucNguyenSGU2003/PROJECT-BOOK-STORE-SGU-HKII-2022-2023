/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Account;
import DTO.KhachHang;
import DTO.Staff;
import DTO.Supplier;
import GUI.homeManage;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class WriteDataToSQL {

    private static final String USER = "sa";
    private static final String PASSWORD = "01254339970a";
    private static final String SERVER_NAME = "DESKTOP-BQLF5L6\\NGUYENCONGDUC";
    private static final String DATABASE_NAME = "PROJECT_BOOKSTORE_LAST";
    private static final int PORT = 1433;


    private static SQLServerDataSource configDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        dataSource.setPortNumber(PORT);
        dataSource.setServerName(SERVER_NAME);
        dataSource.setDatabaseName(DATABASE_NAME);
        dataSource.setEncrypt(false);
        dataSource.setIntegratedSecurity(false);
        dataSource.setTrustServerCertificate(false);
        return dataSource;
    }

    static public int insertDataCustomer(KhachHang KH) {
        SQLServerDataSource ds = configDataSource();

        try (var conn = ds.getConnection()) {
            String sex = "1";
            if (KH.getSex() == "true") {
                sex = "1";
            } else if (KH.getSex() == "0") {
                sex = "0";
            }

            Date d = new Date(System.currentTimeMillis());
            DateFormat df = new SimpleDateFormat();
            df = new SimpleDateFormat("yyyy-MM-dd");
            var sql = "INSERT INTO DBO.CUSTOMER "
                    + "VALUES('" + KH.getMaKH() + "','" + KH.getAccount().getAccount()
                    + "',N'" + KH.getTenKH() + "','" + KH.getNgaySinh() + "',N'" + KH.getDiaChi()
                    + "','" + KH.getPhone() + "'," + sex + ",'" + KH.getDiem() + "','" + KH.getEmail()
                    + "','" + getDay() + "'," + 1 + ")";
//            System.out.println(sql);
            var statement = conn.createStatement();
            try {
                return statement.executeUpdate(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new homeManage(), "Sai ngày tháng");
                JOptionPane.showMessageDialog(new homeManage(), "Bạn Đã Đăng Kí Thất bại");
                return -1;
            }
        } catch (SQLServerException ex) {

            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (SQLException ex) {
            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    static public int insertDataSupplier(Supplier sup) {
        SQLServerDataSource ds = configDataSource();

        try (var conn = ds.getConnection()) {
            Date d = new Date(System.currentTimeMillis());
            DateFormat df = new SimpleDateFormat();
            df = new SimpleDateFormat("yyyy-MM-dd");
            var sql = "INSERT INTO DBO.SUPPLIER \n"
                    + "VALUES('" + sup.getID() + "',N'" + sup.getName() + "','" + getDay()
                    + "',N'" + sup.getAddress() + "','" + sup.getPhone() + "','" + sup.getBankAccount()
                    + "','" + sup.getBankName() + "',1);";

//            System.out.println(sql);
            var statement = conn.createStatement();
              try {
                  return statement.executeUpdate(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new homeManage(), "Sai ngày tháng");
                JOptionPane.showMessageDialog(new homeManage(), "Bạn Đã Đăng Kí Thất bại");
                return -1;
            }
        } catch (SQLServerException ex) {

            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (SQLException ex) {
            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    static public int insertDataAccount(Account acc) {
        SQLServerDataSource ds = configDataSource();

        try (var conn = ds.getConnection()) {
            var sql = "INSERT INTO DBO.ACCOUNT "
                    + "VALUES('" + acc.getAccount() + "','" + acc.getPassword() + "','" + acc.getPosition() + "','" + getDay() + "'," + 1 + ")";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);

        } catch (SQLServerException ex) {

            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (SQLException ex) {
            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    static public int insertDataStaff(Staff sta) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "INSERT INTO DBO.STAFF\n"
                    + "VALUES('" + sta.getID() + "','" + sta.getAccountStr() + "',N'" + sta.getName() + "'," + sta.getSex() + ",'" + sta.getBirthDay() + "',N'" + sta.getAddress() + "','" + sta.getPhone() + "','" + sta.getBankAccount() + "',N'" + sta.getBankName() + "','" + sta.getEmail() + "','" + sta.getCCCD() + "','" + sta.getSalary() + "','" + sta.getBonus() + "','" + getDay() + "',1)";
//            System.out.println(sql);
            var statement = conn.createStatement();

//            try {
                return statement.executeUpdate(sql);
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(new homeManage(), "Sai ngày tháng");
//                JOptionPane.showMessageDialog(new homeManage(), "Bạn Đã Đăng Kí Thất bại");
//                return -1;
//            }
        } catch (SQLServerException ex) {
            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (SQLException ex) {
            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    static public int insertDataBook(DTO.Book book) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {

            var sql = "INSERT INTO DBO.BOOK\n"
                    + "VALUES('" + book.getID() + "',N'" + book.getName() + "','" + book.getType()
                    + "',N'" + book.getAuthor() + "','" + book.getDateComposition() + "','"
                    + book.getPrice() + "','" + book.getQuanaty() + "','" + book.getSourceIMG() + "','" + book.getID_SUPPLIER() + "','" + book.getDetails() + "','" + getDay() + "',1);";
//            System.out.println(sql);

            var statement = conn.createStatement();
            try {
                            return statement.executeUpdate(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new homeManage(), "Sai ngày tháng hoặc mã NCC");
                JOptionPane.showMessageDialog(new homeManage(), "Bạn Đã Đăng Kí Thất bại");
                return -1;
            }
        } catch (SQLServerException ex) {
            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (SQLException ex) {
            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    static public int insertDataBillHomeCusomer(BUS.BillHomeCustomer billHomeCustomer) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {

            var sql = "INSERT INTO DBO.BILLHOMECUSTOMER\n"
                    + "VALUES('" + billHomeCustomer.getID() + "','" + billHomeCustomer.getIDBook() + "','"
                    + billHomeCustomer.getIDCustomer() + "',N'" + billHomeCustomer.getAddress()
                    + "','" + billHomeCustomer.getQuanaty() + "','" + billHomeCustomer.getPrice()
                    + "','" + billHomeCustomer.getTotal() + "','" + getDay() + "',1);";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException ex) {
            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (SQLException ex) {
            Logger.getLogger(WriteDataToSQL.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public static String getDay() {
        Date d = new Date(System.currentTimeMillis());
        DateFormat df = new SimpleDateFormat();
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(d) + "";
    }

    public static void main(String[] args) {
//        BUS.Supplier s= new Supplier("", "", "", "", "", "");
//        DAL.WriteDataToSQL.insertDataSupplier(s);
//BUS.upDateId.updateIDBook();
//        BUS.Book b = new Book("name", "tupe", "author", "dateComposition", "price", "sourceIMG", "Sup1001", getDay());
//        DAL.WriteDataToSQL.insertDataBook(b);
//        System.out.println("haha");
    }

}
