/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.HoaDon_DTO;
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
public class HoaDon_DAO {
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
    
     public ArrayList<HoaDon_DTO> getAllHD(){
        ArrayList<HoaDon_DTO> arr = new ArrayList<HoaDon_DTO>();
       // boolean hienthi ;
        if (openConnection()) {
        try {
        String sql = "Select * from BILL";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            HoaDon_DTO emp = new HoaDon_DTO();
          
            emp.setID_HoaDon(rs.getString(1));
            emp.setID_Staff(rs.getString(2));
            emp.setID_Customer(rs.getString(3));
            emp.setTotal(rs.getFloat(4));
            emp.setDateCreate(rs.getString(5));
            emp.setState(rs.getBoolean(6));
            
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
    
    public boolean addHD(HoaDon_DTO emp) {
        boolean result = false;
        if (openConnection()) {
        try {
            String sql = "Insert into BILL values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, emp.getID_HoaDon());
            stmt.setString(2, emp.getID_Staff());
            stmt.setString(3, emp.getID_Customer());
            stmt.setFloat(4, emp.getTotal());
            stmt.setString(5, emp.getDateCreate());
            stmt.setBoolean(6,true);
 
        if (stmt.executeUpdate()>=1)
            result = true;
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally{
        closeConnection(); } }
        return result;
    }
    
    public ArrayList<HoaDon_DTO> findHoaDons(String idHĐ, String idNV, String ngayTao, String thanhTien, String idKH) {
    ArrayList<HoaDon_DTO> arr = new ArrayList<HoaDon_DTO>();
    String sql = "SELECT * FROM BILL WHERE 1=1";
    if (idHĐ != null && !idHĐ.isEmpty()) {
        sql += " AND ID LIKE '%" + idHĐ + "%'";
    }
    if (idNV != null && !idNV.isEmpty()) {
        sql += " AND ID_STAFF LIKE '%" + idNV + "%'";
    }
    if (ngayTao != null && !ngayTao.isEmpty()) {
        sql += " AND DATECREATE LIKE '%" + ngayTao + "%'";
    }
    if (idKH != null && !idKH.isEmpty()) {
        sql += " AND ID_CUSTOMER LIKE '%" + idKH + "%'";
    }
    if (thanhTien != null && !thanhTien.isEmpty()) {
        sql += " AND TOTAL = '" + thanhTien + "'";
    }
    
    if (openConnection()) {
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HoaDon_DTO emp = new HoaDon_DTO();
                
                emp.setID_HoaDon(rs.getString(1));
                emp.setID_Staff(rs.getString(2));
                emp.setID_Customer(rs.getString(3));
                emp.setTotal(rs.getFloat(4));
                emp.setDateCreate(rs.getString(5));
                emp.setState(rs.getBoolean(6));
                        
                
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
     public ArrayList<HoaDon_DTO> sortUpIdHD(String key){
        ArrayList<HoaDon_DTO> arr = new ArrayList<HoaDon_DTO>();
        if(openConnection()){
            try{
                String sql = "SELECT * FROM BILL ORDER BY " + key + " ASC ";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while(rs.next()){
                    HoaDon_DTO hd = new HoaDon_DTO();
                    hd.setID_HoaDon(rs.getString(1));
                    hd.setID_Staff(rs.getString(2));
                    hd.setID_Customer(rs.getString(3));
                    hd.setTotal(rs.getFloat(4));
                    hd.setDateCreate(rs.getString(5));
                    hd.setState(rs.getBoolean(6));
                    
                    if(hd.isState())
                        arr.add(hd);
                    
                }
            }catch(SQLException ex){
                System.out.println("ex");
            }finally{
                closeConnection();
            }
        }
        return arr;
    }
    public ArrayList<HoaDon_DTO> sortDownIdHD(String key){
        ArrayList<HoaDon_DTO> arr = new ArrayList<HoaDon_DTO>();
        
        if(openConnection()){
            try{
                String sql = "SELECT * FROM BILL ORDER BY " + key +" DESC ";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while(rs.next()){
                    HoaDon_DTO hd = new HoaDon_DTO();
                    hd.setID_HoaDon(rs.getString(1));
                    hd.setID_Staff(rs.getString(2));
                    hd.setID_Customer(rs.getString(3));
                    hd.setTotal(rs.getFloat(4));
                    hd.setDateCreate(rs.getString(5));
                    hd.setState(rs.getBoolean(6));
                    
                    if(hd.isState())
                        arr.add(hd);
                }
            }catch(SQLException ex){
                System.out.println("ex");
            }finally{
                closeConnection();
            }
        }
    return arr;
    }
}
