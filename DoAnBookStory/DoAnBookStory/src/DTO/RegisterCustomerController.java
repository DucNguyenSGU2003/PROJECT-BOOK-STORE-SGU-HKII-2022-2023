/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;


import DAL.ReadDataFromSQL;
import GUI.RegisterCustomerFRM;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import DAL.WriteDataToSQL;
import GUI.homeManage;
import java.beans.Customizer;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class RegisterCustomerController implements ActionListener {

    private GUI.homeManage homeManage;
    private RegisterCustomerFRM reFRM;
    private Check_Error check = new Check_Error();
    private WriteDataToSQL writeData = new WriteDataToSQL();
    private DAL.ReadDataFromSQL readData = new ReadDataFromSQL();
    private ArrayList<KhachHang> customers = new ArrayList<KhachHang>();
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private KhachHang KH;
    private Account acc;

    public RegisterCustomerController(RegisterCustomerFRM reFRM) {
        this.reFRM = reFRM;
//        if (accounts == null) {
//            accounts = new ArrayList<Account>();
//        }
//        if (customers == null) {
//            ArrayList<KhachHang> customers = new ArrayList<KhachHang>();
//        }
//        homeManage = new GUI.homeManage();
//        customers = (ArrayList<KhachHang>) readData.readCustomer();
//        homeManageFRM = new HomeManageFRM();
//        KH = new KhachHang();
//        acc = new Account();
//        this.accounts = (ArrayList<Account>) readData.readAccount();
    }

    public RegisterCustomerController(RegisterCustomerFRM reFRM, GUI.homeManage homeManage1, ArrayList<KhachHang> customers, ArrayList<Account> accounts) {
        if (accounts == null) {
            accounts = new ArrayList<Account>();
        }
        if (customers == null) {
            customers = new ArrayList<KhachHang>();
        }

        this.reFRM = new GUI.RegisterCustomerFRM();
        this.reFRM = reFRM;
        this.homeManage = homeManage1;
        this.customers = customers;
        this.accounts = accounts;
        this.acc = new Account("", "", "");
        this.KH = new KhachHang("", "", "", "", "", acc, "","");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var src = e.getSource();

        if (src.equals(reFRM.getBtnSign())) {
            

        } else if (src.equals(reFRM.getBtnCancle())) {
            this.reFRM.dispose();
        }
    }

    public static void main(String[] args) {

    }

   

    public RegisterCustomerFRM getReFRM() {
        return reFRM;
    }

    public void setReFRM(RegisterCustomerFRM reFRM) {
        this.reFRM = reFRM;
    }

    public Check_Error getCheck() {
        return check;
    }

    public void setCheck(Check_Error check) {
        this.check = check;
    }

    public WriteDataToSQL getWriteData() {
        return writeData;
    }

    public void setWriteData(WriteDataToSQL writeData) {
        this.writeData = writeData;
    }

    public ReadDataFromSQL getReadData() {
        return readData;
    }

    public void setReadData(ReadDataFromSQL readData) {
        this.readData = readData;
    }

    public ArrayList<KhachHang> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<KhachHang> customers) {
        this.customers = customers;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public KhachHang getKH() {
        return KH;
    }

    public void setKH(KhachHang KH) {
        this.KH = KH;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    private void loadData(GUI.homeManage homeManage) {
        homeManage.loadData();
    }

}
