/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAL.ReadDataFromSQL;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class KhachHang {
    private static int count=1000;
    private String maKH;
    private String tenKH;
    private String ngaySinh;
    private String diaChi;
    private String Phone;
    private String email;
    private String sex;
    private Double  diem;
    private Account account;
    private String account1;
    private String position;
    private String dateCreate;
    
    public KhachHang() {
        this.maKH="";
        this.tenKH = "";
        this.diem =0.0;
        this.Phone="";
        this.ngaySinh="";
        this.account = new Account();
        this.diaChi="";
        this.email="";
        this.account.setPosition("Customer");
        this.sex="";
        this.dateCreate="";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
  
    

    public KhachHang(String tenKH,String sex,String Phone,String diaChi,String ngaySinh, Account account,String email,String dateCreate) {
        
        if(this.account==null)
        {
            this.account= new Account();
        }
        count++;
        this.maKH="CS"+count;
        this.tenKH = tenKH;
        this.diem =0.0;
        this.Phone=Phone;
        this.ngaySinh=ngaySinh;
        this.account = account;
        this.diaChi=diaChi;
        this.email=email;
        this.account.setPosition("Customer");
        this.sex=sex;
        this.dateCreate=dateCreate;
    }
    public KhachHang(String tenKH,String sex,String Phone,String diaChi,String ngaySinh, Account account,String email,String dateCreate,Account acc) {
        
        if(this.account==null)
        {
            this.account= new Account();
        }
        count++;
        this.maKH="CS"+count;
        this.tenKH = tenKH;
        this.diem =0.0;
        this.Phone=Phone;
        this.ngaySinh=ngaySinh;
        this.account = account;
        this.diaChi=diaChi;
        this.email=email;
        this.account.setPosition("Customer");
        this.sex=sex;
        this.dateCreate=dateCreate;
    }

    public KhachHang(String maKH,String account, String tenKH, String ngaySinh, String diaChi, String Phone, String sex, String scores, String email,String dateCreate,Account acc) {
       
        if(this.account==null)
        {
            this.account= new Account();
        }
//        if(checkSex==true)
//        {
//            sex="true";
//        }else if(checkSex==false) sex="false";
        
        this.maKH = maKH;
        this.account1= account;
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.Phone = Phone;
        this.sex=sex;
        this.diem=new Double(scores);
        this.email = email;
        this.account.setPosition("Customer");
        this.dateCreate=dateCreate;
        this.account=acc;
    }
    
//     public KhachHang(String maKH,String account, String tenKH, String ngaySinh, String diaChi, String Phone, String sex, String scores, String email,String dateCreate, Account acc) {
//       
//        if(this.account==null)
//        {
//            this.account= new Account();
//        }
////        if(checkSex==true)
////        {
////            sex="true";
////        }else if(checkSex==false) sex="false";
//        
//        this.maKH = maKH;
//        this.account1= account;
//        this.tenKH = tenKH;
//        this.ngaySinh = ngaySinh;
//        this.diaChi = diaChi;
//        this.Phone = Phone;
//        this.sex=sex;
//        this.diem=new Double(scores);
//        this.email = email;
//        this.account.setPosition("Customer");
//        this.dateCreate=dateCreate;
//        this.account=this.account;
//    }
    

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        KhachHang.count = count;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getAccount1() {
        return account1;
    }

    public void setAccount1(String account1) {
        this.account1 = account1;
    }

 

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getDiem() {
        return diem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
    public static void main(String[] args) {
        String s10 = "Xin chào các bạn, mình là TITV.vn";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10, 15);
		System.out.println("s11 = " + s11);
		System.out.println("s12 = " + s12);
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", Phone=" + Phone + ", email=" + email + ", sex=" + sex + ", diem=" + diem + ", account=" + account + ", account1=" + account1 + ", position=" + position + '}';
    }

    public void updateData(String NAME, String ADDRESS, String PHONE, String MAIL, String ACCOUNT, String PASS) {
         setTenKH(NAME);
         setDiaChi(ADDRESS);
         setPhone(PHONE);
         setEmail(MAIL);
         getAccount().setAccount(ACCOUNT);
         getAccount().setPassword(PASS);
    }
    
    
    
    
}
