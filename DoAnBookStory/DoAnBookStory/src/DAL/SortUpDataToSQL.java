/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DTO.KhachHang;
import DTO.Staff;
import DTO.Supplier;
import DTO.Book_DTO;

/**
 *
 * @author Admin
 */
public class SortUpDataToSQL {
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
         if(emp.isState()){
             arr.add(emp); 
         }
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

      
            arr.add(emp); }
    } catch (SQLException ex) {
        System.out.println(ex);
    } finally {
        closeConnection();
        } 
    }
    return arr;  
    
    }
    public ArrayList<Staff> sortUpIdNhanVien(String key){
    ArrayList<Staff> arr = new ArrayList<Staff>();
   // boolean hienthi ;
    if (openConnection()) {
    try {
    String sql = "SELECT * FROM STAFF ORDER BY " + key + " ASC";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
          Staff emp = new Staff();
                
                emp.setID(rs.getString(1));
//                emp.setAccount((Account) rs.getObject(2));
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
                 if(rs.getBoolean(15)){
                    arr.add(emp);
                }
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
     
   public ArrayList<Staff> sortDownIdNhanVien(String key){
    ArrayList<Staff> arr = new ArrayList<Staff>();
   // boolean hienthi ;
    if (openConnection()) {
    try {
    String sql = "SELECT * FROM STAFF ORDER BY " + key + " DESC";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
         Staff emp = new Staff();
                
                emp.setID(rs.getString(1));
     //           emp.setAccount((Account) rs.getObject(2));
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
                 if(rs.getBoolean(15)){
                    arr.add(emp);
                }
          //  arr.add(emp);
    }
    } catch (SQLException ex) {
        System.out.println(ex);
    } finally {
        closeConnection();
        } 
    }
    return arr;  
    
    }
   
    public ArrayList<KhachHang> sortUpIdKhachHang(String key){
    ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
   // boolean hienthi ;
    if (openConnection()) {
    try {
    String sql = "SELECT * FROM CUSTOMER ORDER BY " + key + " ASC";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
        KhachHang emp = new KhachHang();
         
          emp.setMaKH(rs.getString(1));
        //        emp.setAccount((Account) rs.getObject(2));
                emp.setTenKH(rs.getString(3));
                emp.setNgaySinh(rs.getString(4));
                emp.setDiaChi(rs.getString(5));
                emp.setPhone(rs.getString(6));
                emp.setSex(rs.getString(7));
                emp.setDiem(rs.getDouble(8));
                emp.setEmail(rs.getString(9));
                emp.setDateCreate(rs.getString(10));
                   if(rs.getBoolean(11)){
                         arr.add(emp); 
                   }
//            arr.add(emp); 
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
     
   public ArrayList<KhachHang> sortDownIdKhachHang(String key){
    ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
   // boolean hienthi ;
    if (openConnection()) {
    try {
    String sql = "SELECT * FROM CUSTOMER ORDER BY " + key + " DESC";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
         KhachHang emp = new KhachHang();
                emp.setMaKH(rs.getString(1));
         //       emp.setAccount((Account) rs.getObject(2));
                emp.setTenKH(rs.getString(3));
                emp.setNgaySinh(rs.getString(4));
                emp.setDiaChi(rs.getString(5));
                emp.setPhone(rs.getString(6));
                emp.setSex(rs.getString(7));
                emp.setDiem(rs.getDouble(8));
                emp.setEmail(rs.getString(9));
                emp.setDateCreate(rs.getString(10));
                  if(rs.getBoolean(11)){
                         arr.add(emp); 
                   }
           // arr.add(emp); 
    }
           
    } catch (SQLException ex) {
        System.out.println(ex);
    } finally {
        closeConnection();
        } 
    }
    return arr;  
    
    }
   
    public ArrayList<Supplier> sortUpIdNCC(String key){
    ArrayList<Supplier> arr = new ArrayList<Supplier>();
   // boolean hienthi ;
    if (openConnection()) {
    try {
    String sql = "SELECT * FROM SUPPLIER ORDER BY " + key + " ASC";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
         Supplier emp = new Supplier();
                
                emp.setID(rs.getString(1));
                emp.setName(rs.getString(2));
                emp.setDateCreate(rs.getString(3));
                emp.setAddress(rs.getString(4));
                emp.setPhone(rs.getString(5));
                emp.setBankAccount(rs.getString(6));
                emp.setBankName(rs.getString(7));
                if(rs.getBoolean(8)){
                    arr.add(emp);
                }
//            arr.add(emp); 
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
     
   public ArrayList<Supplier> sortDownIdNCC(String key){
    ArrayList<Supplier> arr = new ArrayList<Supplier>();
   // boolean hienthi ;
    if (openConnection()) {
    try {
    String sql = "SELECT * FROM SUPPLIER ORDER BY " + key + " DESC";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
          Supplier emp = new Supplier();
                
                emp.setID(rs.getString(1));
                emp.setName(rs.getString(2));
                emp.setDateCreate(rs.getString(3));
                emp.setAddress(rs.getString(4));
                emp.setPhone(rs.getString(5));
                emp.setBankAccount(rs.getString(6));
                emp.setBankName(rs.getString(7));
                if(rs.getBoolean(8)){
                    arr.add(emp);
                }
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
   
}
