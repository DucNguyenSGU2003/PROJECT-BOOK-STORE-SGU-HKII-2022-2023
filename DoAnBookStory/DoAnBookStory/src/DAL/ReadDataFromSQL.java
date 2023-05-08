/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Account;
import BUS.BillHomeCustomer;
import DTO.KhachHang;

import DTO.Staff;
import DTO.Supplier;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ReadDataFromSQL {

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

    public ReadDataFromSQL() {
//        readDataCustomer();
//        readDataStaff();
//        readDataAccount();
//        readDataBook();
//        readDataBill();
//        readDataBill_of_Stoker();
//        readData

        ArrayList<KhachHang> customers = new ArrayList<KhachHang>();
        customers.addAll(readCustomer());
        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts.addAll(readAccount());
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        staffs.addAll(readStaff());

    }

    public static Collection<? extends KhachHang> readCustomer() {
        ArrayList<KhachHang> customers = new ArrayList<KhachHang>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.CUSTOMER";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var ACCOUNT = resultSet.getString(2);
                var NAME = resultSet.getString(3);
                var BIRTHDAY = resultSet.getString(4);
                var ADDRESS = resultSet.getString(5);
                var PHONE = resultSet.getString(6);
                var SEX = resultSet.getString(7);
                var SCORES = resultSet.getString(8);
                var EMAIL = resultSet.getString(9);
                var DATECREATE = resultSet.getString(10);
                var isDel = resultSet.getString(11);
                ArrayList<Account> accounts = new ArrayList<Account>();
                accounts = (ArrayList<Account>) readAccount();
                Account acc = new Account();
               

                if (isDel.equals("1")) {
                    ArrayList<Account> account = new ArrayList<Account>();
                    Account acc1 = new Account();
                    account = (ArrayList<Account>) readAccount();
                    for (Account a : account) {
                        if (a.getAccount().equals(ACCOUNT)) {
                            acc1 = a;
                            break;
                        }
                    }
                    KhachHang customer = new KhachHang(id, ACCOUNT, NAME, BIRTHDAY, ADDRESS, PHONE, SEX, SCORES, EMAIL, DATECREATE, acc1);
                    customers.add(customer);

                }

            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;

    }
    
    
//     public static Collection<? extends KhachHang> readCustomer() {
//        ArrayList<KhachHang> customers = new ArrayList<KhachHang>();
//        SQLServerDataSource ds = configDataSource();
//        try (var conn = ds.getConnection()) {
//            var sql = "SELECT * FROM DBO.CUSTOMER";
//            var ps = conn.prepareStatement(sql);
//            var resultSet = ps.executeQuery();
//
//            while (resultSet.next()) {
//                var id = resultSet.getString(1);
//                var ACCOUNT = resultSet.getString(2);
//                var NAME = resultSet.getString(3);
//                var BIRTHDAY = resultSet.getString(4);
//                var ADDRESS = resultSet.getString(5);
//                var PHONE = resultSet.getString(6);
//                var SEX = resultSet.getString(7);
//                var SCORES = resultSet.getString(8);
//                var EMAIL = resultSet.getString(9);
//                var DATECREATE = resultSet.getString(10);
//                var isDel = resultSet.getString(11);
//                ArrayList<Account> accounts = new ArrayList<Account>();
//                accounts = (ArrayList<Account>) readAccount();
//                Account acc = new Account();
//               
//
//                if (isDel.equals("1")) {
//                    ArrayList<Account> account = new ArrayList<Account>();
//                    Account acc1 = new Account();
//                    account = (ArrayList<Account>) readAccount();
//                    for (Account a : account) {
//                        if (a.getAccount().equals(ACCOUNT)) {
//                            acc1 = a;
//                            break;
//                        }
//                    }
//                    KhachHang customer = new KhachHang(id, ACCOUNT, NAME, BIRTHDAY, ADDRESS, PHONE, SEX, SCORES, EMAIL, DATECREATE, acc1);
//                    customers.add(customer);
//
//                }
//
//            }
//        } catch (SQLServerException ex) {
//            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return customers;
//
//    }
    
      public static Collection<? extends BUS.BillHomeCustomer> readBillHomeCustomer() {
        ArrayList<BillHomeCustomer> BillHomeCustomers = new ArrayList<BillHomeCustomer>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.BILLHOMECUSTOMER";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                var ID = resultSet.getString(1);
                var IDBook=resultSet.getString(2);
                var IDCUSTOMER = resultSet.getString(3);
                var ADDRESS = resultSet.getString(4);
                var QUANATY = resultSet.getString(5);
                var PRICE = resultSet.getString(6);
                var TOTAL = resultSet.getString(7);
                var DATECREATE = resultSet.getString(8);
                var isDel = resultSet.getString(9);
               
                if (isDel.equals("1")) {
                    BUS.BillHomeCustomer billHomeCustomer= new BillHomeCustomer(ID,IDBook, IDCUSTOMER, ADDRESS, QUANATY, PRICE, TOTAL);
                    BillHomeCustomers.add(billHomeCustomer);

                }

            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return BillHomeCustomers;

    }
       public static Collection<? extends DTO.Supplier> readSupplierNoIsDel() {
        ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.SUPPLIER";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var name = resultSet.getString(2);
                var dateCreate = resultSet.getString(3);
                var address = resultSet.getString(4);
                var phone = resultSet.getString(5);
                var bankAccount = resultSet.getString(6);
                var bankName = resultSet.getString(7);
                var isDel = resultSet.getString(8);
                    DTO.Supplier supplier= new Supplier(id,name, address, phone, bankAccount, bankName, dateCreate);
                   // System.out.println(supplier.toString());
                    suppliers.add(supplier);


            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return suppliers;

    }
       public static Collection<? extends DTO.Supplier> readSupplier() {
        ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.SUPPLIER";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var name = resultSet.getString(2);
                var dateCreate = resultSet.getString(3);
                var address = resultSet.getString(4);
                var phone = resultSet.getString(5);
                var bankAccount = resultSet.getString(6);
                var bankName = resultSet.getString(7);
                var isDel = resultSet.getString(8);
                    DTO.Supplier supplier= new Supplier(id,name, address, phone, bankAccount, bankName, dateCreate);
                    if(isDel.equals("1"))
                    {
                        suppliers.add(supplier);
   
                    }


            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return suppliers;

    }
       
       
    
    
    
     public static Collection<? extends KhachHang> readCustomerNoIsDel() {
        ArrayList<KhachHang> customers = new ArrayList<KhachHang>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.CUSTOMER";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {

                var id = resultSet.getString(1);
                var ACCOUNT = resultSet.getString(2);
                var NAME = resultSet.getString(3);
                var BIRTHDAY = resultSet.getString(4);
                var ADDRESS = resultSet.getString(5);
                var PHONE = resultSet.getString(6);
                var SEX = resultSet.getString(7);
                var SCORES = resultSet.getString(8);
                var EMAIL = resultSet.getString(9);
                var DATECREATE = resultSet.getString(10);
                var isDel = resultSet.getString(11);
                ArrayList<Account> accounts = new ArrayList<Account>();
                accounts = (ArrayList<Account>) readAccount();
                Account acc = new Account();
               

                    ArrayList<Account> account = new ArrayList<Account>();
                    Account acc1 = new Account();
                    account = (ArrayList<Account>) readAccount();
                    for (Account a : account) {
                        if (a.getAccount().equals(ACCOUNT)) {
                            acc1 = a;
                            break;
                        }
                    }
                    KhachHang customer = new KhachHang(id, ACCOUNT, NAME, BIRTHDAY, ADDRESS, PHONE, SEX, SCORES, EMAIL, DATECREATE, acc1);
                    customers.add(customer);


            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;

    }
     

    public  static Collection<? extends Account> readAccount() {
        ArrayList<Account> accounts = new ArrayList<Account>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.ACCOUNT";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();
            while (resultSet.next()) {
                var account = resultSet.getString(1);
                var passWord = resultSet.getString(2);
                var position = resultSet.getString(3);
                var dateCreate = resultSet.getString(4);
                var isDel = resultSet.getString(5);
                if (isDel.equals("1")) {
                    Account acc = new Account(account, passWord, position, dateCreate);
                    accounts.add(acc);
                }

            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }
    
     public  static Collection<? extends Account> readAccountNoIsDel() {
        ArrayList<Account> accounts = new ArrayList<Account>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.ACCOUNT";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();
            while (resultSet.next()) {
                var account = resultSet.getString(1);
                var passWord = resultSet.getString(2);
                var position = resultSet.getString(3);
                var dateCreate = resultSet.getString(4);
                var isDel = resultSet.getString(5);
                    Account acc = new Account(account, passWord, position, dateCreate);
                    accounts.add(acc);

            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }

    public static void main(String[] args) {
//        ReadDataFromSQL read= new ReadDataFromSQL();
//       ArrayList<Account> acc = new ArrayList<Account>();
//       acc=(ArrayList<Account>) read.readAccount();
//       for(Account a:acc)
//       {
//           System.out.println(a.getAccount());
//       }

//        ReadDataFromSQL read= new ReadDataFromSQL();
//       ArrayList<KhachHang> acc = new ArrayList<KhachHang>();
//       acc=(ArrayList<KhachHang>) read.readCustomer();
//       for(KhachHang a:acc)
//       {
//           System.out.println(a.getAccount());
//       }
//        System.out.println(KhachHang.getCount());
//            ReadDataFromSQL read = new ReadDataFromSQL();
//            ArrayList<KhachHang> customers= new ArrayList<KhachHang>();
//            customers=(ArrayList<KhachHang>) read.readCustomer();
//                for(KhachHang x: customers)
//            {
//                System.out.println(x.getAccount().toString());
//            }

    }

    public static Collection<? extends Staff> readStaff() {
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.STAFF";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var ACCOUNT = resultSet.getString(2);
                var NAME = resultSet.getString(3);
                var SEX = resultSet.getString(4);
                var BIRTHDAY = resultSet.getString(5);
                var ADDRESS = resultSet.getString(6);
                var PHONE = resultSet.getString(7);
                var BANKACCOUNT = resultSet.getString(8);
                var BANKNAME = resultSet.getString(9);
                var EMAIL = resultSet.getString(10);
                var CCCD = resultSet.getString(11);
                var SALARY = resultSet.getString(12);
                var BONUS = resultSet.getString(13);
                var DATECREATE = resultSet.getString(14);
                var isDel = resultSet.getString(15);

                if (isDel.equals("1")) {
                    ArrayList<Account> accounts = new ArrayList<Account>();
                    Account acc = new Account();
                    accounts = (ArrayList<Account>) readAccount();
                    for (Account a : accounts) {
                        if (a.getAccount().equals(ACCOUNT)) {
                            acc = a;
                            break;
                        }
                    }
                    Staff sta = new Staff(id, ACCOUNT, NAME, SEX, BIRTHDAY, ADDRESS, PHONE, BANKACCOUNT, BANKNAME, EMAIL, CCCD, SALARY, BONUS, DATECREATE, acc);
                    staffs.add(sta);
                }

            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return staffs;
    }
     public static Collection<? extends Staff> readStaffNoIsDel() {
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.STAFF";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var ACCOUNT = resultSet.getString(2);
                var NAME = resultSet.getString(3);
                var SEX = resultSet.getString(4);
                var BIRTHDAY = resultSet.getString(5);
                var ADDRESS = resultSet.getString(6);
                var PHONE = resultSet.getString(7);
                var BANKACCOUNT = resultSet.getString(8);
                var BANKNAME = resultSet.getString(9);
                var EMAIL = resultSet.getString(10);
                var CCCD = resultSet.getString(11);
                var SALARY = resultSet.getString(12);
                var BONUS = resultSet.getString(13);
                var DATECREATE = resultSet.getString(14);
                var isDel = resultSet.getString(15);

                    ArrayList<Account> accounts = new ArrayList<Account>();
                    Account acc = new Account();
                    accounts = (ArrayList<Account>) readAccount();
                    for (Account a : accounts) {
                        if (a.getAccount().equals(ACCOUNT)) {
                            acc = a;
                            break;
                        }
                    }
                    Staff sta = new Staff(id, ACCOUNT, NAME, SEX, BIRTHDAY, ADDRESS, PHONE, BANKACCOUNT, BANKNAME, EMAIL, CCCD, SALARY, BONUS, DATECREATE, acc);
                    staffs.add(sta);

            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return staffs;
    }
     
     
     public static Collection<? extends DTO.Book> readBook() {
        ArrayList<DTO.Book> books = new ArrayList<DTO.Book>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.BOOK";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var name = resultSet.getString(2);
                var type = resultSet.getString(3);
                var author = resultSet.getString(4);
                var dateComposition = resultSet.getString(5);
                var price = resultSet.getString(6);
                var quanity=resultSet.getString(7);
                var sourceIMG = resultSet.getString(8);
                var IDSupplier = resultSet.getString(9);
                var details=resultSet.getString(10);
                var dateCreate = resultSet.getString(11);
                 var isDel = resultSet.getString(12);

                if (isDel.equals("1")) {
                   DTO.Book b= new DTO.Book(id, name, type, author, dateComposition, price, sourceIMG, dateCreate, IDSupplier, quanity, details);
                   books.add(b);
                }

            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
    }
     
     public static Collection<? extends DTO.Book> readBookNoIsDel() {
        ArrayList<DTO.Book> books = new ArrayList<DTO.Book>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM DBO.BOOK";
            var ps = conn.prepareStatement(sql);
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var name = resultSet.getString(2);
                var type = resultSet.getString(3);
                var author = resultSet.getString(4);
                var dateComposition = resultSet.getString(5);
                var price = resultSet.getString(6);
                var quanity=resultSet.getString(7);
                var sourceIMG = resultSet.getString(8);
                var IDSupplier = resultSet.getString(9);
                var details=resultSet.getString(10);
                var dateCreate = resultSet.getString(11);
                 var isDel = resultSet.getString(12);

                   DTO.Book b= new DTO.Book(id, name, type, author, dateComposition, price, sourceIMG, dateCreate, IDSupplier, name, isDel);
                   books.add(b);

            }
        } catch (SQLServerException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
    }
     

}
