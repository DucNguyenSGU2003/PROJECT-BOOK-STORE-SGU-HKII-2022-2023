/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

/**
 *
 * @author DELL
 */
public class BillHomeCustomer {

    private static  int count = 1000;
    private String ID;
    private String IDBook;
    private String IDCustomer;
    private String address;
    private String quanaty;
    private String price;
    private String total;

    public BillHomeCustomer(String ID, String IDBook,String IDCustomer, String address, String quanaty, String price, String total) {
        this.ID = ID;
        this.IDBook=IDBook;
        this.IDCustomer = IDCustomer;
        this.address = address;
        this.quanaty = quanaty;
        this.price = price;
        this.total = total;
    }

    public BillHomeCustomer(String IDBook,String IDCustomer, String address, String quanaty, String price, String total) {
        this.count++;
        this.ID="BILL"+count;
        this.IDBook=IDBook;
        
        this.IDCustomer = IDCustomer;
        this.address = address;
        this.quanaty = quanaty;
        this.price = price;
        this.total = total;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDCustomer() {
        return IDCustomer;
    }

    public void setIDCustomer(String IDCustomer) {
        this.IDCustomer = IDCustomer;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BillHomeCustomer.count = count;
    }

    public String getIDBook() {
        return IDBook;
    }

    public void setIDBook(String IDBook) {
        this.IDBook = IDBook;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQuanaty() {
        return quanaty;
    }

    public void setQuanaty(String quanaty) {
        this.quanaty = quanaty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    

    
}
