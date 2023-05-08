/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.BILL_DAO;
import DTO.BILL_DTO;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BILL_BUS {
    
    BILL_DAO hd_DAO = new BILL_DAO();
    
    public ArrayList<BILL_DTO> getAllBill()
    {
        return hd_DAO.getAllBill();
    }
    
//    public String addBill(HoaDon_DTO hd){
//        if(hd_DAO.hasBillID(hd.getMaHD()))
//            return " Mã hóa đơn đã tồn tại !!";
//        if(hd_DAO.addBill(hd))
//            return " Thêm hóa đơn thành công ";
//        return " Thêm hóa đơn thất bại !!";
//    }
    
    public String updateBill (BILL_DTO hd){
        if(hd_DAO.updateBill(hd))
            return " Sửa hóa đơn thành công ";
        return " Sửa hóa đơn thất bại";
    }
    
//    public String deleteBill(BILL_DTO hd){
//        if(hd_DAO.deleteBill(hd))
//            return " Xóa thành công";
//        return "Xóa thất bại";
//    }
//    
//    public void deleteIdBill(HoaDon_DTO hd){
//        hd_DAO.deleteIdBill(hd);
//    }
    
    public ArrayList<BILL_DTO> findBillId(String id){
        return hd_DAO.findBill(id);
    }
    
    public ArrayList<BILL_DTO> sortUpIdBill(String key){
        return hd_DAO.sortUpIdBill(key);
    }
    
    public ArrayList<BILL_DTO> sortDownIdBill(String key){
        return hd_DAO.sortDownIdBill(key);
    }
    
}
