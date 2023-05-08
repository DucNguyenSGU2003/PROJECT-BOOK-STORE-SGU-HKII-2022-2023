/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import GUI.HomeCustomer;
import GUI.LoginFRM;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class FindDataSQL {

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

    public static Collection<? extends DTO.Book> readBookFind(String Name) {
        ArrayList<DTO.Book> books = new ArrayList<DTO.Book>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {

//                var sql = "SELECT * FROM DBO.BOOK\n"
//                        + "WHERE NAME LIKE N'%" +Name+"%';";
                var sql="SELECT * FROM BOOK WHERE NAME lIKE ?";
                var ps = conn.prepareStatement(sql);
                            try {
                var resultSet = ps.executeQuery();

                while (resultSet.next()) {
                    var id = resultSet.getString(1);
                    var name = resultSet.getString(2);
                    var type = resultSet.getString(3);
                    var author = resultSet.getString(4);
                    var dateComposition = resultSet.getString(5);
                    var price = resultSet.getString(6);
                    var quanity = resultSet.getString(7);
                    var sourceIMG = resultSet.getString(8);
                    var IDSupplier = resultSet.getString(9);
                    var details = resultSet.getString(10);
                    var dateCreate = resultSet.getString(11);
                    var isDel = resultSet.getString(12);

                    if (isDel.equals("1")) {
                        DTO.Book b = new DTO.Book(id, name, type, author, dateComposition, price, sourceIMG, dateCreate, IDSupplier, quanity, details);
                        books.add(b);

                    }

                }
            } catch (SQLServerException ex) {
                Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ReadDataFromSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new HomeCustomer(new LoginFRM()), "Sách " + Name + " Không có!");
        }
        return books;


    }

}
