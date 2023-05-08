/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.KhachHang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class KhachHang_DAO {
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

    
    
    public boolean updateCustomerQuanaty(KhachHang khanhhang) {
    boolean result = false;
    if (openConnection()) {
        try {
            String sql = "UPDATE CUSTOMER SET SCORES=? WHERE ID=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(2, khanhhang.getMaKH()); 
            stmt.setDouble(1, khanhhang.getDiem());
            
           
            
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
