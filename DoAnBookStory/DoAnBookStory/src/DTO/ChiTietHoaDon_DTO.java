/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon_DTO {
    
    private int count=1000;
    
    private String ID_CTHD ;
    private String ID_Book;
    private String ID_Bill ;
    private int quantity ; // số lượng
    private String price ;// giá
    public float total ;// giá * số lượng
    private String dateCreate ; // ngày tạo
    private boolean state ; // trạng thái

    public ChiTietHoaDon_DTO(String ID_CTHD,String ID_Book, String ID_Bill, int quantity, String price, float total, String dateCreate, boolean state) {
        count+=1;
        
        this.ID_CTHD = ID_CTHD;
        this.ID_Book = ID_Book;
        this.ID_Bill = ID_Bill;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.dateCreate = dateCreate;
        this.state = state;
    }

    public ChiTietHoaDon_DTO(){
         this.ID_CTHD = "";
         this.ID_Book = "";
        this.ID_Bill = "";
        this.quantity = 0;
        this.price = "";
        this.total = 0;
        this.dateCreate = "";
   
    }
    
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getID_CTHD() {
        return ID_CTHD;
    }

    public void setID_CTHD(String ID_CTHD) {
        this.ID_CTHD = ID_CTHD;
    }

    public String getID_Bill() {
        return ID_Bill;
    }

    public void setID_Bill(String ID_Bill) {
        this.ID_Bill = ID_Bill;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getID_Book() {
        return ID_Book;
    }

    public void setID_Book(String ID_Book) {
        this.ID_Book = ID_Book;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon_DTO{" + "ID_CTHD=" + ID_CTHD + ", ID_Book=" + ID_Book + ", ID_Bill=" + ID_Bill + ", quantity=" + quantity + ", price=" + price + ", total=" + total + ", dateCreate=" + dateCreate + ", state=" + state + '}';
    }
    
    
    
}
