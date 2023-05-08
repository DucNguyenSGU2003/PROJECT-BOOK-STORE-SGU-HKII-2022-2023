/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;



/**
 *
 * @author Admin
 */
public class HoaDon_DTO {
    private int count=1000;
    
    private String ID_HoaDon ;
    private String ID_Staff ; // id nhân viên
    private String ID_Customer ; //id khách hàng
    private float total ;
    private String dateCreate ;
    private boolean state ; // trạng thái

    public HoaDon_DTO(String ID_HoaDon, String ID_Staff, String ID_Customer, float total, String dateCreate, boolean state) {
        
        count+=1;
        
        this.ID_HoaDon = ID_HoaDon;
        this.ID_Staff = ID_Staff;
        this.ID_Customer = ID_Customer;
        this.total = total;
        this.dateCreate = dateCreate;
        this.state = state;
    }

    public HoaDon_DTO() {
         this.ID_HoaDon = "";
        this.ID_Staff = "";
        this.ID_Customer = "";
        this.total = 0;
        this.dateCreate = "";
        
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    
    
    
    public String getID_HoaDon() {
        return ID_HoaDon;
    }

    public void setID_HoaDon(String ID_HoaDon) {
        this.ID_HoaDon = ID_HoaDon;
    }

    public String getID_Staff() {
        return ID_Staff;
    }

    public void setID_Staff(String ID_Staff) {
        this.ID_Staff = ID_Staff;
    }

    public String getID_Customer() {
        return ID_Customer;
    }

    public void setID_Customer(String ID_Customer) {
        this.ID_Customer = ID_Customer;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "HoaDon_DTO{" + "ID_HoaDon=" + ID_HoaDon + ", ID_Staff=" + ID_Staff + ", ID_Customer=" + ID_Customer + ", total=" + total + ", dateCreate=" + dateCreate + ", state=" + state + '}';
    }
    
    
}
