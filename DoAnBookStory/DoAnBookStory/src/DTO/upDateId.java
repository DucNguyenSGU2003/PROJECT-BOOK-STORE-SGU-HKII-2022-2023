/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import BUS.BillHomeCustomer;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class upDateId {
    public static void updateIDCustomer(KhachHang customer)
    {
        ArrayList<KhachHang> customers= new ArrayList<KhachHang>();
        customers=(ArrayList<KhachHang>) DAL.ReadDataFromSQL.readCustomerNoIsDel();
        int max=0;
        for(KhachHang cus:customers)
        {
            Integer tmp=new Integer(cus.getMaKH().substring(2));//cs1001
            if(max<tmp)
            {
                max=tmp;
            }
            
        }
        KhachHang.setCount(max+1);
        customer.setMaKH("CS"+KhachHang.getCount());
        
    }
    
    public static void updateIDStaff(Staff staff)
    {
        ArrayList<Staff> staffs=new ArrayList<Staff>();
        staffs=(ArrayList<Staff>) DAL.ReadDataFromSQL.readStaffNoIsDel();
        int max=1000;
        for(Staff sta:staffs)
        {
            int tmp=Integer.parseInt(sta.getID().substring(3));
            if(max<tmp) max=tmp;
        }
        Staff.setCount(max+1);
        staff.setID("STA"+Staff.getCount());
    }
    
    public static void updateIDBook(DTO.Book book)
    {
        ArrayList<DTO.Book> books=new ArrayList<DTO.Book >();
        books=(ArrayList<DTO.Book >) DAL.ReadDataFromSQL.readBookNoIsDel();
        int max=0;
        for(DTO.Book b:books)
        {
            int tmp=Integer.parseInt(b.getID().substring(3));
            if(max<tmp) max=tmp;
        }
        Book.setCount(max+1);
        book.setID("BOO"+Book.getCount());
    }
    
    public static void updateIDSupplier(Supplier sup)
    {
        ArrayList<DTO.Supplier> Suppliers=new ArrayList<DTO.Supplier>();
        Suppliers=(ArrayList<DTO.Supplier >) DAL.ReadDataFromSQL.readSupplierNoIsDel();
        int max=0;
        for(DTO.Supplier Supplier:Suppliers)
        {
            int tmp=Integer.parseInt(Supplier.getID().substring(3));
            if(max<tmp) max=tmp;
        }
        Supplier.setCount(max+1);
        sup.setID("Sup"+Supplier.getCount());
    }
    
    public static void updateIDBillCustomer(BillHomeCustomer sup)
    {
        ArrayList<BUS.BillHomeCustomer> Suppliers=new ArrayList<BUS.BillHomeCustomer>();
        Suppliers=(ArrayList<BUS.BillHomeCustomer >) DAL.ReadDataFromSQL.readBillHomeCustomer();
        int max=0;
        for(BUS.BillHomeCustomer Supplier:Suppliers)
        {
            int tmp=Integer.parseInt(Supplier.getID().substring(3));
            if(max<tmp) max=tmp;
        }
        Supplier.setCount(max+1);
        sup.setID("Sup"+Supplier.getCount());
    }
    
}
