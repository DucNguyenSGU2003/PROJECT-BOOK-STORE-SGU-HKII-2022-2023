/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.HoaDon_DAO;
import DTO.HoaDon_DTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon_BUS {
    HoaDon_DAO hd_DAO = new HoaDon_DAO();
    
    public ArrayList<HoaDon_DTO> getAllHD(){ 
      return hd_DAO.getAllHD(); 
  }
  public String addHD(HoaDon_DTO emp) {
        if (hd_DAO.addHD(emp))
            return "Thêm thành công";
        return "Thêm thất bại";
    }
   public ArrayList<HoaDon_DTO> findHoaDons(String idHĐ, String idNV, String ngayTao, String thanhTien, String idKH) 
 {
      return hd_DAO.findHoaDons( idHĐ,  idNV,  ngayTao,  thanhTien,  idKH);
  }
  
    public ArrayList<HoaDon_DTO> sortUpIdHD(String key){
        return hd_DAO.sortUpIdHD(key);
    }
    
    public ArrayList<HoaDon_DTO> sortDownIdHD(String key){
        return hd_DAO.sortDownIdHD(key);
    }
}
