/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import DTO.BILL_DTO;
import DTO.HoaDon_DTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BILL_DAO {
    private Connection con;
    public boolean openConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl = "jdbc:sqlserver://localhost:1433;DatabaseName = PROJECT_BOOKSTORE_LAST ;encrypt=false";
            String username = "sa";
            String password ="01254339970a";
            
            con = (Connection) DriverManager.getConnection(dbUrl,username, password);
            return true;
            
        }catch(Exception ex){
            System.out.println("ex");
            return false;
        }    
    }
    public void closeConnection()
    {
        try{
            if(con != null)
               con.close();
        }catch(SQLException ex){
            System.out.println("ex");
        }
    }
    public static void main(String[] args){
        HoaDon_DAO hd1 = new HoaDon_DAO();
        hd1.openConnection();
    }
    
    public ArrayList<BILL_DTO> getAllBill(){
        ArrayList<BILL_DTO> arr = new ArrayList<BILL_DTO>();
        if(openConnection()){
            try{
                String sql = " SELECT * FROM HOADON";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next())
                {
                    BILL_DTO hd = new BILL_DTO();
                    hd.setMaHD(rs.getString(1));
                    hd.setMaNV(rs.getString(2));
                    hd.setMaKH(rs.getString(3));
                    hd.setNgayLap(rs.getString(4));
                    hd.setThanhTien(rs.getFloat(5));
                    hd.setTrangThai(rs.getBoolean(6));
//                    if(hd.getTrangThai())
//                        arr.add(hd);
                }
            }catch(SQLException ex){
                System.out.println("ex");
            }finally{
                closeConnection();
            }
        }
        return arr;
    }
    
    public boolean hasBillID(String id){
            boolean result = false;
            if(openConnection()){
                try{
                    String sql = "SELECT * FROM HOADON WHERE MANV=?";
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    
                    pstmt.setString(1, id);
                    ResultSet rs = pstmt.executeQuery();
                    result = rs.next();
                }catch(SQLException ex){
                    System.out.println("ex");
                }finally{
                    closeConnection();
                }
            }
            return result;
        }
    
    public boolean updateBill(BILL_DTO hd){
        boolean result = false;
        if(openConnection())
        {   
            try
            {
                String sql = "UPDATE HOADON SET MAHD=?, MANV=?, MAKH=?, NGAYLAP=?, TONGTIEN=?, TRANGTHAI = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                
                stmt.setString(6, hd.getMaHD());
                stmt.setString(1, hd.getMaNV());
                stmt.setString(2, hd.getMaKH());
                stmt.setString(3, hd.getNgayLap());
                stmt.setFloat(4, hd.getThanhTien());
                stmt.setBoolean(5, hd.getTrangThai());
                
                if(stmt.executeUpdate() >=1){
                    result = true;
                }
            
            }
            catch(SQLException ex){
                System.out.println("ex");
            }
            finally
                {
                    closeConnection();
                }
            }
        return result;
    }
    
    public ArrayList<BILL_DTO> findBill(String id){
        ArrayList<BILL_DTO> arr = new ArrayList<BILL_DTO>();
        
        if(openConnection()){
            try{
                String sql = "SELECT *FROM HOADON WHERE MAHD LIKE ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, "%"+id+"%");
                ResultSet rs = pstmt.executeQuery();
                
                while(rs.next()){
                    BILL_DTO hd = new BILL_DTO();
                    hd.setMaHD(rs.getString(1));
                    hd.setMaNV(rs.getString(2));
                    hd.setMaKH(rs.getString(3));
                    hd.setNgayLap(rs.getString(4));
                    hd.setThanhTien(rs.getFloat(5));
                    hd.setTrangThai(rs.getBoolean(6));
                    
                    if(hd.getTrangThai())
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
    
    public ArrayList<BILL_DTO> sortUpIdBill(String key){
        ArrayList<BILL_DTO> arr = new ArrayList<BILL_DTO>();
        if(openConnection()){
            try{
                String sql = "SELECT *FROM HOADON ORDER BY " + key + "ASC";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while(rs.next()){
                    BILL_DTO hd = new BILL_DTO();
                    hd.setMaHD(rs.getString(1));
                    hd.setMaNV(rs.getString(2));
                    hd.setMaKH(rs.getString(3));
                    hd.setNgayLap(rs.getString(4));
                    hd.setTrangThai(rs.getBoolean(5));
                    
                    if(hd.getTrangThai())
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
    public ArrayList<BILL_DTO> sortDownIdBill(String key){
        ArrayList<BILL_DTO> arr = new ArrayList<BILL_DTO>();
        
        if(openConnection()){
            try{
                String sql = "SELECT * FROM HOADON ORDER BY " + key +" DESC ";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while(rs.next()){
                    BILL_DTO hd = new BILL_DTO();
                    hd.setMaHD(rs.getString(1));
                    hd.setMaNV(rs.getString(2));
                    hd.setMaKH(rs.getString(3));
                    hd.setNgayLap(rs.getString(4));
                    hd.setThanhTien(rs.getFloat(5));
                    hd.setTrangThai( rs.getBoolean(6));
                    
                    if(hd.getTrangThai())
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
