/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Account;
import DTO.KhachHang;
import DTO.Staff;
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
public class EditDataToSQL {

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

    public int insertDataCustomer(KhachHang KH) {
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
                    + "VALUES('" + KH.getMaKH() + "','" + KH.getAccount().getAccount() + "',N'" + KH.getTenKH() + "','" + KH.getNgaySinh() + "',N'" + KH.getDiaChi() + "','" + KH.getPhone() + "'," + sex + "," + KH.getDiem() + ",'" + KH.getEmail() + "','" + getDay() + "'," + 1 + ")";
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

    public int insertDataAccount(Account acc) {
        SQLServerDataSource ds = configDataSource();

        try (var conn = ds.getConnection()) {
            var sql = "INSERT INTO DBO.ACCOUNT "
                    + "VALUES('" + acc.getAccount() + "','" + acc.getPassword() + "','" + acc.getPosition() + "'," + 1 + ")";
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

    public static int editDataStaff(Staff sta) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.STAFF\n"
                    + "SET ID='" + sta.getID() + "',ACCOUNT='" + sta.getAccountStr() + "',NAME=N'" + sta.getName() + "',SEX=" + sta.getSex() + ",BIRTHDAY='" + sta.getBirthDay() + "',ADDRESS=N'" + sta.getAddress() + "',PHONE='" + sta.getPhone() + "',BANK_ACCOUNT='" + sta.getBankAccount() + "',NAME_BANKACCOUNT=N'" + sta.getBankName() + "',EMAIL='" + sta.getEmail() + "',CCCD='" + sta.getCCCD() + "',SALARY='" + sta.getSalary() + "',BONUS='" + sta.getBonus() + "',DateCreate='" + getDay() + "',STATE=1\n"
                    + "WHERE ID = '" + sta.getID() + "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    
    public static int editDataSupplier(DTO.Supplier sup) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.SUPPLIER\n"
                    + "SET ID='"+sup.getID()+"',NAME='"+sup.getName()+
                    "',DATECREATE='"+sup.getDateCreate()
                    + "',ADDRESS=N'"+sup.getAddress()+"',PHONE='"+sup.getPhone()+
                    "',BANK_ACCOUNT='"+sup.getBankAccount()+"',NAME_BANKACCOUNT='"
                    +sup.getBankName()+"',STATE=1\n"
                    + "WHERE ID = '" + sup.getID() + "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    
    
    public static int editDataCustomer(KhachHang cus) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.CUSTOMER\n"
                    +"SET ID='"+cus.getMaKH()+"',ACCOUNT='"+cus.getAccount().getAccount()+"',NAME =N'"+cus.getTenKH()+"',BIRTHDAY='"+cus.getNgaySinh()+"',ADDRESS=N'"+cus.getDiaChi()+"',PHONE='"+cus.getPhone()+"', SEX="+cus.getSex()+",SCORES='"+cus.getDiem()+"',EMAIL='"+cus.getEmail()+"',dateCreate='"+getDay()+"',STATE=1\n"
                    + "WHERE ID = '" + cus.getMaKH()+ "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }

    public static int editDataAccount(Account acc) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.ACCOUNT\n"
                    + "SET ACCOUNT='" + acc.getAccount() + "',PASSWORD='" + acc.getPassword() + "',POSITION='" + acc.getPosition() + "',STATE=1"
                    + "\nWHERE ACCOUNT = '" + acc.getAccount() + "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    
    public static int editDataBook(DTO.Book book) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.BOOK\n"
                    +"SET ID= '"+book.getID()+"',NAME='"+book.getName()+
                    "',TYPE='"+book.getType()+"',AUTHOR='"+book.getAuthor()+
                    "',DATEOFCOMPOSITION='"+book.getDateComposition()+
                    "',PRICE='"+book.getPrice()+"',QUANATY='"+book.getQuanaty()+"',SOURCE_IMG='"+book.getSourceIMG()
                    +"',ID_SUPPLIER='"+book.getID_SUPPLIER()+"',DETAILS='"+book.getDetails()+"',DATECREATE='"+
                    book.getDateCreate()+"',STATE=1\n"
                    + "WHERE ID = '" + book.getID() + "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            try {
                            return statement.executeUpdate(sql);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(new homeManage(), "Nhà Cung Cấp Chưa có");
                return -1;
            }
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    
    
    
    
    
    public static int removeAccount(Account acc) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.ACCOUNT\n"
                    + "SET STATE=0\n"
                    + "WHERE ACCOUNT = '" + acc.getAccount() + "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    
    public static int removeDataAccount(Account acc) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "DELETE FROM DBO.ACCOUNT\n"
                    + "WHERE ACCOUNT = '" + acc.getAccount() + "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    
    public static int removeSupllier(DTO.Supplier sup) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.SUPPLIER\n"
                    + "SET STATE=0\n"
                    + "WHERE ID = '" + sup.getID() + "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    public static int removeStaff(Staff sta) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.STAFF\n"
                    + "SET STATE=0\n"
                    + "WHERE ID = '" + sta.getID()+ "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    
     public static int removeCustomer(KhachHang cus) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.CUSTOMER\n"
                    + "SET STATE=0\n"
                    + "WHERE ID = '" + cus.getMaKH()+ "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
     
       public static int removeBook(DTO.Book book) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE DBO.BOOK\n"
                    + "SET STATE=0\n"
                    + "WHERE ID = '" + book.getID()+ "';";
//            System.out.println(sql);
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
   

    public int insertDataBook() {
        return 1;
    }

    public static String getDay() {
        Date d = new Date(System.currentTimeMillis());
        DateFormat df = new SimpleDateFormat();
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(d) + "";
    }
}
