/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author DELL
 */
public class Supplier {

    static int count = 1000;
    private String ID;
    private String name;
    private String address;
    private String phone;
    private String bankAccount;
    private String bankName;
    private String dateCreate;

    public Supplier(String name, String address, String phone, String bankAccount, String bankName, String dateCreate) {
        count += 1;
        this.ID = "Sup" + count;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.bankAccount = bankAccount;
        this.bankName = bankName;
        this.dateCreate = dateCreate;
    }

    public Supplier() {
        this.ID = "";
        this.name = "";
        this.address = "";
        this.phone = "";
        this.bankAccount = "";
        this.bankName = "";
        this.dateCreate = "";
    }

    public Supplier(String ID, String name, String address, String phone, String bankAccount, String bankName, String dateCreate) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.bankAccount = bankAccount;
        this.bankName = bankName;
        this.dateCreate = dateCreate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Supplier.count = count;
    }

    @Override
    public String toString() {
        return "Supplier{" + "ID=" + ID + ", name=" + name + ", address=" + address + ", phone=" + phone + ", bankAccount=" + bankAccount + ", bankName=" + bankName + ", dateCreate=" + dateCreate + '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }
    public void edit()
    {
        
    }

    public void edit(String name, String address, String phone, String bankAccount, String bankName) {
        setName(name);
        setAddress(address);
        setPhone(phone);
        setBankAccount(bankAccount);
        setBankName(bankName);
        
    }

}
