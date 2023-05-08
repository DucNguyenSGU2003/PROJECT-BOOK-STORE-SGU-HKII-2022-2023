/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.ChiTietHoaDon_DAO;
import DTO.ChiTietHoaDon_DTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon_BUS {
    ChiTietHoaDon_DAO empDAO = new ChiTietHoaDon_DAO(); 
  
  public ArrayList<ChiTietHoaDon_DTO> getAllCTHD(){ 
      return empDAO.getAllCTHD(); 
  }
  public String addCTHD(ChiTietHoaDon_DTO emp) {
//        if (empDAO.hasEmployeeID(emp.getMaNV()))
//            return "Mã NV đã tồn tại";
        if (empDAO.addCTHD(emp))
            return "Thêm thành công";
        return "Thêm thất bại";
    }
}
