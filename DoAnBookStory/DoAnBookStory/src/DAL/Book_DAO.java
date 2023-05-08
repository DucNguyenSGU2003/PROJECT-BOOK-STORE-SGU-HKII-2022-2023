/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Book_DTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Book_DAO {
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
        Book_DAO p1 = new Book_DAO();
        p1.openConnection();  
        //p1.findBooks("", "", "", "", "", "", "","50000");
    }
    
    
    
    public ArrayList<Book_DTO> getAllEmployees(){
        ArrayList<Book_DTO> arr = new ArrayList<Book_DTO>();
       // boolean hienthi ;
        if (openConnection()) {
        try {
        String sql = "Select * from BOOK";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
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
        }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            closeConnection();
            } 
        
        }
        return arr;
     }
    
    public ArrayList<Book_DTO> findEmployeeById(String id) {
    ArrayList<Book_DTO> arr = new ArrayList<Book_DTO>();
    //NhanVien_DTO emp = null;
    if (openConnection()) {
        try {
            String sql = "SELECT * FROM BOOK WHERE NAME lIKE ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%"+id+"%");
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
    return arr;
  }
     
  public ArrayList<Book_DTO> sortUpIdEmployees(String key){
    ArrayList<Book_DTO> arr = new ArrayList<Book_DTO>();
   // boolean hienthi ;
    if (openConnection()) {
    try {
    String sql = "SELECT * FROM BOOK ORDER BY " + key + " ASC";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
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
           // arr.add(emp); 
        }
    } catch (SQLException ex) {
        System.out.println(ex);
    } finally {
        closeConnection();
        } 
        
    }
//    for(NhanVien_DTO nv: arr){
//        System.out.println("Ma nv: "+ nv.getMaNV());
//    }
//    
    return arr;
 }  
     
   public ArrayList<Book_DTO> sortDownIdEmployees(String key){
    ArrayList<Book_DTO> arr = new ArrayList<Book_DTO>();
   // boolean hienthi ;
    if (openConnection()) {
    try {
    String sql = "SELECT * FROM BOOK ORDER BY " + key + " DESC";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
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
    return arr;  
    
    }

//public ArrayList<Book_DTO> findBooks(String id, String tenSach, String theLoai, String NCC, String tacGia, String soLuong, String dateCreate, String price) {
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
//                if(emp.isState())
//                    arr.add(emp); 
//                //arr.add(emp);
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

   public boolean updateBookQuanaty(Book_DTO book) {
    boolean result = false;
    if (openConnection()) {
        try {
            String sql = "UPDATE BOOK SET QUANATY=? WHERE ID=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(2, book.getID()); 
            stmt.setString(1, book.getQuanaty());
            
           
            
            if (stmt.executeUpdate() >= 1) {
                result = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            closeConnection();
        }
    }
    return result;
    }
   
   
}

