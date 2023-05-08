/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.ChiTietHoaDon_DTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon_DAO {
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
    
    public ArrayList<ChiTietHoaDon_DTO> getAllCTHD(){
        ArrayList<ChiTietHoaDon_DTO> arr = new ArrayList<ChiTietHoaDon_DTO>();
       // boolean hienthi ;
        if (openConnection()) {
        try {
        String sql = "Select * from BILLDETAIL";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            ChiTietHoaDon_DTO emp = new ChiTietHoaDon_DTO();
          
            emp.setID_CTHD(rs.getString(1));
            emp.setID_Book(rs.getString(2));
            emp.setID_Bill(rs.getString(3));
            emp.setQuantity(rs.getInt(4));
            emp.setPrice(rs.getString(5));
            emp.setTotal(rs.getFloat(6));
            emp.setDateCreate(rs.getString(7));
            emp.setState(rs.getBoolean(8));
            
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
    
    public boolean addCTHD(ChiTietHoaDon_DTO emp) {
        boolean result = false;
        if (openConnection()) {
        try {
            String sql = "Insert into BILLDETAIL values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, emp.getID_CTHD());
            stmt.setString(2, emp.getID_Book());
            stmt.setString(3, emp.getID_Bill());
            stmt.setInt(4, emp.getQuantity());
            stmt.setString(5, emp.getPrice());
            stmt.setFloat(6, emp.getTotal());
            stmt.setString(7, emp.getDateCreate());
            stmt.setBoolean(8,true);
 
        if (stmt.executeUpdate()>=1)
            result = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally{
        closeConnection(); } }
        return result;
    }
    
    public ArrayList<ChiTietHoaDon_DTO> getCTHDofKH(){
         ArrayList<ChiTietHoaDon_DTO> arr = new ArrayList<ChiTietHoaDon_DTO>();
       // boolean hienthi ;
        if (openConnection()) {
        try {
        String sql = "Select * from BILLDETAIL";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            ChiTietHoaDon_DTO emp = new ChiTietHoaDon_DTO();
          
            emp.setID_CTHD(rs.getString(1));
            emp.setID_Book(rs.getString(2));
            emp.setID_Bill(rs.getString(3));
            emp.setQuantity(rs.getInt(4));
            emp.setPrice(rs.getString(5));
            emp.setTotal(rs.getFloat(6));
            emp.setDateCreate(rs.getString(7));
            emp.setState(rs.getBoolean(8));
            
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
    
}
