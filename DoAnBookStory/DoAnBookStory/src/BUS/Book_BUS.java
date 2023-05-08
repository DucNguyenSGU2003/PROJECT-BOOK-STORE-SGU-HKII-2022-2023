/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.Book_DAO;
import DTO.Book_DTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Book_BUS {
    Book_DAO empDAO = new Book_DAO(); 
  
  public ArrayList<Book_DTO> getAllEmployees(){ 
      return empDAO.getAllEmployees(); 
  }
  
  public ArrayList<Book_DTO> findEmployeeById(String id){
      return empDAO.findEmployeeById(id);
  }
   public ArrayList<Book_DTO> sortUpIdEmployees(String key){ 
      return empDAO.sortUpIdEmployees(key); 
  }  
   
   public ArrayList<Book_DTO> sortDownIdEmployees(String key){ 
      return empDAO.sortDownIdEmployees(key); 
  }  
   
   public ArrayList<Book_DTO> findBooks(String id, String tenSach, String theLoai, String NCC, String tacGia, String soLuong, String dateCreate, String price) 
 {
      return empDAO.findBooks( id, tenSach, theLoai, NCC, tacGia, soLuong, dateCreate, price);
              }
   
   
   public String updateBookQuanaty(Book_DTO emp){
       if (empDAO.updateBookQuanaty(emp))
            return "Sửa thành công";
        return "Thêm thất bại";
  }
}
