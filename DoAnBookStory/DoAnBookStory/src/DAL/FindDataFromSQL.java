/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Book;
import DTO.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.KhachHang;
import DTO.Staff;
import DTO.Supplier;
import DTO.Book_DTO;

/**
 *
 * @author Admin
 */
public class FindDataFromSQL {
    private Connection con;
    public boolean openConnection() {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dbUrl = "jdbc:sqlserver://localhost:1433;DatabaseName = PROJECT_BOOKSTORE_LAST;encrypt=false";
        String username = "sa"; String password= "01254339970a";
        con = (Connection) DriverManager.getConnection(dbUrl, username, password);   
        return true;
        }catch (Exception ex) {
            System.out.println(ex);
            return false; }
    }
    
     public void closeConnection() {
    try {
        if (con!=null)
        con.close();
    } catch (SQLException ex) {
        System.out.println(ex); }
    }
      public static void main(String[] args) {
        FindDataFromSQL p1 = new FindDataFromSQL();
        p1.openConnection();  
    }

    public ArrayList<Book> findEmployeeById(String id) {
    ArrayList<Book> arr = new ArrayList<Book>();
    //NhanVien_DTO emp = null;
    if (openConnection()) {
        try {
            String sql = "SELECT * FROM BOOK WHERE NAME lIKE ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%"+id+"%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Book emp = new Book();

                    emp.setID(rs.getString(1));
                    emp.setName(rs.getString(2));
                    emp.setType(rs.getString(3));
                    emp.setAuthor(rs.getString(4));
                    emp.setDateComposition(rs.getString(5));
                    emp.setPrice(rs.getString(6));
                    emp.setQuanaty(rs.getString(7));
                    emp.setSourceIMG(rs.getString(8));
                    emp.setID_SUPPLIER(rs.getString(9));
                    emp.setDetails(rs.getString(10));
                    emp.setDateCreate(rs.getString(11));

                    
               
                    arr.add(emp);}
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            closeConnection();
        }
    }
    return arr;
  }
    
   public ArrayList<Book> findEmployeeByPrice(float minPrice,float maxPrice ) {
    ArrayList<Book> arr = new ArrayList<Book>();
    //NhanVien_DTO emp = null;
    if (openConnection()) {
        try {
            String sql = "SELECT * FROM BOOK WHERE CAST(PRICE AS FLOAT) >= ? AND CAST(PRICE AS FLOAT) <= ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, minPrice);
            pstmt.setDouble(2, maxPrice);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Book emp = new Book();

                    emp.setID(rs.getString(1));
                    emp.setName(rs.getString(2));
                    emp.setType(rs.getString(3));
                    emp.setAuthor(rs.getString(4));
                    emp.setDateComposition(rs.getString(5));
                    emp.setPrice(rs.getString(6));
                    emp.setQuanaty(rs.getString(7));
                    emp.setSourceIMG(rs.getString(8));
                    emp.setID_SUPPLIER(rs.getString(9));
                    emp.setDetails(rs.getString(10));
                    emp.setDateCreate(rs.getString(11));

                    
               
                    arr.add(emp);}
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            closeConnection();
        }
    }
    return arr;
  }
//  public ArrayList<Book_DTO> findBooks(String id, String tenSach, String theLoai, String NCC, String tacGia, String soLuong, String dateCreate, String price) {
//    ArrayList<Book_DTO> arr = new ArrayList<Book_DTO>();
//    String sql = "SELECT * FROM BOOK WHERE 1=1";
//    if (id != null && !id.isEmpty()) {
//        sql += " AND ID LIKE '%" + id + "%'";
//    }
//    if (tenSach != null && !tenSach.isEmpty()) {
//        sql += " AND NAME LIKE '%" + tenSach + "%'";
//    }
//    if (theLoai != null && !theLoai.isEmpty()) {
//        sql += " AND TYPE LIKE '%" + theLoai + "%'";
//    }
//    if (NCC != null && !NCC.isEmpty()) {
//        sql += " AND ID_SUPPLIER LIKE '%" + NCC + "%'";
//    }
//    if (tacGia != null && !tacGia.isEmpty()) {
//        sql += " AND AUTHOR LIKE '%" + tacGia + "%'";
//    }
//    if (soLuong != null && !soLuong.isEmpty()) {
//        sql += " AND QUANATY = '" + soLuong + "'";
//    }
//    if (dateCreate != null && !dateCreate.isEmpty()) {
//        sql += " AND DATECREATE LIKE '%" + dateCreate + "%'";
//    }
//    if (price != null && !price.isEmpty()) {
//        sql += " AND PRICE = '" + price + "'";
//    }
//    if (openConnection()) {
//        try {
//            PreparedStatement pstmt = con.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                Book_DTO emp = new Book_DTO();
//                emp.setID(rs.getString(1));
//                emp.setName(rs.getString(2));
//                emp.setType(rs.getString(3));
//                emp.setAuthor(rs.getString(4));
//                emp.setDateComposition(rs.getString(5));
//                emp.setPrice(rs.getString(6));
//                emp.setQuanaty(rs.getString(7));
//                emp.setSourceIMG(rs.getString(8));
//                emp.setID_SUPPLIER(rs.getString(9));
//                emp.setDetails(rs.getString(10));
//                emp.setDateCreate(rs.getString(11));
//                emp.setState(rs.getBoolean(12));
//                 if(emp.isState())
//                    arr.add(emp); 
////                arr.add(emp);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        } finally {
//            closeConnection();
//        }
//    }
////    for (Book_DTO book : arr) {
////        System.out.println("Ma nv: " + book.getID());
////    }
//    return arr;
//}
public ArrayList<Book_DTO> findBooks(String id, String tenSach, String theLoai, String NCC, String tacGia, String soLuong, String dateCreate, String price) {
    ArrayList<Book_DTO> arr = new ArrayList<Book_DTO>();
    String sql = "SELECT * FROM BOOK WHERE 1=1";
    if (id != null && !id.isEmpty()) {
        sql += " AND ID LIKE ?";
    }
    if (tenSach != null && !tenSach.isEmpty()) {
        sql += " AND NAME LIKE ?";
    }
    if (theLoai != null && !theLoai.isEmpty()) {
        sql += " AND TYPE LIKE ?";
    }
    if (NCC != null && !NCC.isEmpty()) {
        sql += " AND ID_SUPPLIER LIKE ?";
    }
    if (tacGia != null && !tacGia.isEmpty()) {
        sql += " AND AUTHOR LIKE ?";
    }
    if (soLuong != null && !soLuong.isEmpty()) {
        sql += " AND QUANATY = ?";
    }
    if (dateCreate != null && !dateCreate.isEmpty()) {
        sql += " AND DATECREATE LIKE ?";
    }
    if (price != null && !price.isEmpty()) {
        sql += " AND PRICE = ?";
    }
    if (openConnection()) {
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            int parameterIndex = 1;
            if (id != null && !id.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + id + "%");
            }
            if (tenSach != null && !tenSach.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + tenSach + "%");
            }
            if (theLoai != null && !theLoai.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + theLoai + "%");
            }
            if (NCC != null && !NCC.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + NCC + "%");
            }
            if (tacGia != null && !tacGia.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + tacGia + "%");
            }
            if (soLuong != null && !soLuong.isEmpty()) {
                pstmt.setString(parameterIndex++, soLuong);
            }
            if (dateCreate != null && !dateCreate.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + dateCreate + "%");
            }
            if (price != null && !price.isEmpty()) {
                pstmt.setString(parameterIndex++, price);
            }
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Book_DTO emp = new Book_DTO();
                emp.setID(rs.getString(1));
                emp.setName(rs.getString(2));
                emp.setType(rs.getString(3));
                emp.setAuthor(rs.getString(4));
                emp.setDateComposition(rs.getString(5));
                emp.setPrice(rs.getString(6));
                emp.setQuanaty(rs.getString(7));
                emp.setSourceIMG(rs.getString(8));
                emp.setID_SUPPLIER(rs.getString(9));
                emp.setDetails(rs.getString(10));
                emp.setDateCreate(rs.getString(11));
                emp.setState(rs.getBoolean(12));
                if(emp.isState())
                    arr.add(emp);
            //arr.add(emp);
            }
            } catch (SQLException ex) {
            System.out.println(ex);
            } finally {
            closeConnection();
            }
    }
    // for (Book_DTO book : arr) {
    // System.out.println("Ma nv: " + book.getID());
    // }
    return arr;
}
//  public ArrayList<Staff> findNhanViens(String id, String tenNV, String CCCD, String phone, String address, String sinhNhat, String dateCreate, String salary,String email,String sex) {
//    ArrayList<Staff> arr = new ArrayList<Staff>();
//    String sql = "SELECT * FROM STAFF WHERE 1=1";
//    if (id != null && !id.isEmpty()) {
//        sql += " AND ID LIKE '%" + id + "%'";
//    }
//    if (tenNV != null && !tenNV.isEmpty()) {
//        sql += " AND NAME LIKE '%" + tenNV + "%'";
//    }
//    if (CCCD != null && !CCCD.isEmpty()) {
//        sql += " AND CCCD LIKE '%" + CCCD + "%'";
//    }
//    if (phone != null && !phone.isEmpty()) {
//        sql += " AND PHONE LIKE '%" + phone + "%'";
//    }
//    if (address != null && !address.isEmpty()) {
//        sql += " AND ADDRESS LIKE '%" + address + "%'";
//    }
//    if (sinhNhat != null && !sinhNhat.isEmpty()) {
//         sql += " AND BIRTHDAY LIKE '%" + sinhNhat + "%'";
//    }
//    if (dateCreate != null && !dateCreate.isEmpty()) {
//        sql += " AND DATECREATE LIKE '%" + dateCreate + "%'";
//    }
//    if (email != null && !email.isEmpty()) {
//        sql += " AND EMAIL LIKE '%" + email + "%'";
//    }
//    if (sex != null && !sex.isEmpty()) {
//         sql += " AND SEX = '" + sex + "'";
//    }
//    if (salary != null && !salary.isEmpty()) {
//        sql += " AND SALARY = '" + salary + "'";
//    }
//    if (openConnection()) {
//        try {
//            PreparedStatement pstmt = con.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                Staff emp = new Staff();
//                
//                emp.setID(rs.getString(1));
//                emp.setName(rs.getString(3));
//                emp.setSex(rs.getString(4));
//                emp.setBirthDay(rs.getString(5));
//                emp.setAddress(rs.getString(6));
//                emp.setPhone(rs.getString(7));
//                emp.setBankAccount(rs.getString(8));
//                emp.setNameBank(rs.getString(9));
//                emp.setEmail(rs.getString(10));
//                emp.setCCCD(rs.getString(11));
//                emp.setSalary(rs.getString(12));
//                emp.setBonus(rs.getString(13));
//                emp.setDateCreate(rs.getString(14));
//                if(rs.getBoolean(15)){
//                    arr.add(emp);
//                }
//                    
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        } finally {
//            closeConnection();
//        }
//    }
//    return arr;
//}

public ArrayList<Staff> findNhanViens(String id, String tenNV, String CCCD, String phone, String address, String sinhNhat, String dateCreate, String salary, String email, String sex) {
    ArrayList<Staff> arr = new ArrayList<Staff>();
    String sql = "SELECT * FROM STAFF WHERE 1=1";
    if (id != null && !id.isEmpty()) {
        sql += " AND ID LIKE ?";
    }
    if (tenNV != null && !tenNV.isEmpty()) {
        sql += " AND NAME LIKE ?";
    }
    if (CCCD != null && !CCCD.isEmpty()) {
        sql += " AND CCCD LIKE ?";
    }
    if (phone != null && !phone.isEmpty()) {
        sql += " AND PHONE LIKE ?";
    }
    if (address != null && !address.isEmpty()) {
        sql += " AND ADDRESS LIKE ?";
    }
    if (sinhNhat != null && !sinhNhat.isEmpty()) {
        sql += " AND BIRTHDAY LIKE ?";
    }
    if (dateCreate != null && !dateCreate.isEmpty()) {
        sql += " AND DATECREATE LIKE ?";
    }
    if (email != null && !email.isEmpty()) {
        sql += " AND EMAIL LIKE ?";
    }
    if (sex != null && !sex.isEmpty()) {
        sql += " AND SEX = ?";
    }
    if (salary != null && !salary.isEmpty()) {
        sql += " AND SALARY = ?";
    }
    if (openConnection()) {
        try {
        PreparedStatement pstmt = con.prepareStatement(sql);
        int parameterIndex = 1;
        if (id != null && !id.isEmpty()) {
            pstmt.setString(parameterIndex++, "%" + id + "%");
        }
        if (tenNV != null && !tenNV.isEmpty()) {
            pstmt.setString(parameterIndex++, "%" + tenNV + "%");
        }
        if (CCCD != null && !CCCD.isEmpty()) {
            pstmt.setString(parameterIndex++, "%" + CCCD + "%");
        }
        if (phone != null && !phone.isEmpty()) {
            pstmt.setString(parameterIndex++, "%" + phone + "%");
        }
        if (address != null && !address.isEmpty()) {
            pstmt.setString(parameterIndex++, "%" + address + "%");
        }
        if (sinhNhat != null && !sinhNhat.isEmpty()) {
            pstmt.setString(parameterIndex++, "%" + sinhNhat + "%");
        }
        if (dateCreate != null && !dateCreate.isEmpty()) {
            pstmt.setString(parameterIndex++, "%" + dateCreate + "%");
        }
        if (email != null && !email.isEmpty()) {
            pstmt.setString(parameterIndex++, "%" + email + "%");
        }
        if (sex != null && !sex.isEmpty()) {
            pstmt.setString(parameterIndex++, sex);
        }
        if (salary != null && !salary.isEmpty()) {
            pstmt.setString(parameterIndex++, salary);
        }
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Staff emp = new Staff();
            emp.setID(rs.getString(1));
            emp.setName(rs.getString(3));
            emp.setSex(rs.getString(4));
            emp.setBirthDay(rs.getString(5));
            emp.setAddress(rs.getString(6));
            emp.setPhone(rs.getString(7));
            emp.setBankAccount(rs.getString(8));
            emp.setNameBank(rs.getString(9));
            emp.setEmail(rs.getString(10));
            emp.setCCCD(rs.getString(11));
            emp.setSalary(rs.getString(12));
            emp.setBonus(rs.getString(13));
            emp.setDateCreate(rs.getString(14));
            if (rs.getBoolean(15)) {
                    arr.add(emp);
                }
            }
        } catch (SQLException ex) {
        System.out.println(ex);
        } finally {
        closeConnection();
        }
    }
return arr;
}

//   public ArrayList<Supplier> findNCCs(String id, String tenNCC, String address, String phone, String bankName, String bankAccount, String dateCreate) {
//    ArrayList<Supplier> arr = new ArrayList<Supplier>();
//    String sql = "SELECT * FROM SUPPLIER WHERE 1=1";
//    if (id != null && !id.isEmpty()) {
//        sql += " AND ID LIKE '%" + id + "%'";
//    }
//    if (tenNCC != null && !tenNCC.isEmpty()) {
//        sql += " AND NAME LIKE '%" + tenNCC + "%'";
//    }
//     if (address != null && !address.isEmpty()) {
//        sql += " AND ADDRESS LIKE '%" + address + "%'";
//    }
//    if (bankAccount != null && !bankAccount.isEmpty()) {
//        sql += " AND BANK_ACCOUNT LIKE '%" + bankAccount + "%'";
//    }
//    if (phone != null && !phone.isEmpty()) {
//        sql += " AND PHONE LIKE '%" + phone + "%'";
//    }
//    if (bankName != null && !bankName.isEmpty()) {
//        sql += " AND NAME_BANKACCOUNT LIKE '%" + bankName + "%'";
//    }
//    
//    if (dateCreate != null && !dateCreate.isEmpty()) {
//        sql += " AND DATECREATE LIKE '%" + dateCreate + "%'";
//    }
//   
//    if (openConnection()) {
//        try {
//            PreparedStatement pstmt = con.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                Supplier emp = new Supplier();
//                
//                emp.setID(rs.getString(1));
//                emp.setName(rs.getString(2));
//                emp.setDateCreate(rs.getString(3));
//                emp.setAddress(rs.getString(4));
//                emp.setPhone(rs.getString(5));
//                emp.setBankAccount(rs.getString(6));
//                emp.setBankName(rs.getString(7));
//                    if(rs.getBoolean(8)){
//                          arr.add(emp);
//                    }
//                //arr.add(emp);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        } finally {
//            closeConnection();
//        }
//    }
//    return arr;
//}

public ArrayList<Supplier> findNCCs(String id, String tenNCC, String address, String phone, String bankName, String bankAccount, String dateCreate) {
    ArrayList<Supplier> arr = new ArrayList<Supplier>();
    String sql = "SELECT * FROM SUPPLIER WHERE 1=1";
    if (id != null && !id.isEmpty()) {
    sql += " AND ID LIKE ?";
    }
    if (tenNCC != null && !tenNCC.isEmpty()) {
    sql += " AND NAME LIKE ?";
    }
    if (address != null && !address.isEmpty()) {
    sql += " AND ADDRESS LIKE ?";
    }
    if (bankAccount != null && !bankAccount.isEmpty()) {
    sql += " AND BANK_ACCOUNT LIKE ?";
    }
    if (phone != null && !phone.isEmpty()) {
    sql += " AND PHONE LIKE ?";
    }
    if (bankName != null && !bankName.isEmpty()) {
    sql += " AND NAME_BANKACCOUNT LIKE ?";
    }
    if (dateCreate != null && !dateCreate.isEmpty()) {
    sql += " AND DATECREATE LIKE ?";
    }
    if (openConnection()) {
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            int parameterIndex = 1;

            if (id != null && !id.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + id + "%");
            }
            if (tenNCC != null && !tenNCC.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + tenNCC + "%");
            }
            if (address != null && !address.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + address + "%");
            }
            if (bankAccount != null && !bankAccount.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + bankAccount + "%");
            }
            if (phone != null && !phone.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + phone + "%");
            }
            if (bankName != null && !bankName.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + bankName + "%");
            }
            if (dateCreate != null && !dateCreate.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + dateCreate + "%");
            }

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Supplier emp = new Supplier();
                emp.setID(rs.getString(1));
                emp.setName(rs.getString(2));
                emp.setDateCreate(rs.getString(3));
                emp.setAddress(rs.getString(4));
                emp.setPhone(rs.getString(5));
                emp.setBankAccount(rs.getString(6));
                emp.setBankName(rs.getString(7));
                if (rs.getBoolean(8)) {
                    arr.add(emp);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            closeConnection();
        }
    }
return arr;
}

// public ArrayList<KhachHang> findKhachHangs(String id, String tenKH, String scores,String email, String address, String phone, String sex, String dateCreate, String sinhNhat) {
//    ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
//    String sql = "SELECT * FROM CUSTOMER WHERE 1=1";
//    if (id != null && !id.isEmpty()) {
//        sql += " AND ID LIKE '%" + id + "%'";
//    }
//    if (tenKH != null && !tenKH.isEmpty()) {
//        sql += " AND NAME LIKE '%" + tenKH + "%'";
//    }
//    if (address != null && !address.isEmpty()) {
//        sql += " AND ADDRESS LIKE '%" + address + "%'";
//    }
//    if (email != null && !email.isEmpty()) {
//        sql += " AND EMAIL LIKE '%" + email + "%'";
//    }
//    if (phone != null && !phone.isEmpty()) {
//        sql += " AND PHONE LIKE '%" + phone + "%'";
//    }
//     if (sex != null && !sex.isEmpty()) {
//         sql += " AND SEX = '" + sex + "'";
//    }
//    if (scores != null && !scores.isEmpty()) {
//        sql += " AND SCORES = '" + scores + "'";
//    }
//    if (dateCreate != null && !dateCreate.isEmpty()) {
//        sql += " AND DATECREATE LIKE '%" + dateCreate + "%'";
//    }
//   if (sinhNhat != null && !sinhNhat.isEmpty()) {
//         sql += " AND BIRTHDAY LIKE '%" + sinhNhat + "%'";
//    }
//    if (openConnection()) {
//        try {
//            PreparedStatement pstmt = con.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                KhachHang emp = new KhachHang();
//                
//                emp.setMaKH(rs.getString(1));
//                emp.setTenKH(rs.getString(3));
//                emp.setNgaySinh(rs.getString(4));
//                emp.setDiaChi(rs.getString(5));
//                emp.setPhone(rs.getString(6));
//                emp.setSex(rs.getString(7));
//                emp.setDiem(rs.getDouble(8));
//                emp.setEmail(rs.getString(9));
//                emp.setDateCreate(rs.getString(10));
//                    if(rs.getBoolean(11)){
//                         arr.add(emp);
//                      }
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        } finally {
//            closeConnection();
//        }
//    }
//    return arr;
//}
public ArrayList<KhachHang> findKhachHangs(String id, String tenKH, String scores, String email, String address, String phone, String sex, String dateCreate, String sinhNhat) {
    ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
    String sql = "SELECT * FROM CUSTOMER WHERE 1=1";
    if (id != null && !id.isEmpty()) {
    sql += " AND ID LIKE ?";
    }
    if (tenKH != null && !tenKH.isEmpty()) {
    sql += " AND NAME LIKE ?";
    }
    if (address != null && !address.isEmpty()) {
    sql += " AND ADDRESS LIKE ?";
    }
    if (email != null && !email.isEmpty()) {
    sql += " AND EMAIL LIKE ?";
    }
    if (phone != null && !phone.isEmpty()) {
    sql += " AND PHONE LIKE ?";
    }
    if (sex != null && !sex.isEmpty()) {
    sql += " AND SEX = ?";
    }
    if (scores != null && !scores.isEmpty()) {
    sql += " AND SCORES = ?";
    }
    if (dateCreate != null && !dateCreate.isEmpty()) {
    sql += " AND DATECREATE LIKE ?";
    }
    if (sinhNhat != null && !sinhNhat.isEmpty()) {
    sql += " AND BIRTHDAY LIKE ?";
    }
    if (openConnection()) {
    try {
    PreparedStatement pstmt = con.prepareStatement(sql);
    int parameterIndex = 1;
     if (id != null && !id.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + id + "%");
            }
            if (tenKH != null && !tenKH.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + tenKH + "%");
            }
            if (address != null && !address.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + address + "%");
            }
            if (email != null && !email.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + email + "%");
            }
            if (phone != null && !phone.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + phone + "%");
            }
            if (sex != null && !sex.isEmpty()) {
                pstmt.setString(parameterIndex++, sex);
            }
            if (scores != null && !scores.isEmpty()) {
                pstmt.setString(parameterIndex++, scores);
            }
            if (dateCreate != null && !dateCreate.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + dateCreate + "%");
            }
            if (sinhNhat != null && !sinhNhat.isEmpty()) {
                pstmt.setString(parameterIndex++, "%" + sinhNhat + "%");
            }

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                KhachHang emp = new KhachHang();
                emp.setMaKH(rs.getString(1));
                emp.setTenKH(rs.getString(3));
                emp.setNgaySinh(rs.getString(4));
                emp.setDiaChi(rs.getString(5));
                emp.setPhone(rs.getString(6));
                emp.setSex(rs.getString(7));
                emp.setDiem(rs.getDouble(8));
                emp.setEmail(rs.getString(9));
                emp.setDateCreate(rs.getString(10));
                if (rs.getBoolean(11)) {
                    arr.add(emp);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            closeConnection();
        }
    }
    return arr;
    }
}
