/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Account {
    private String position;
    private String account;
    private String password;
    private String dateCreate;
    //contructer
    public Account(String account, String password, String position,String dateCreate) {
        this.position = position;
        this.account = account;
        this.password = password;
        this.dateCreate= dateCreate;
    }
    

    public Account(String account, String password,String dateCreate) {
        this.account = account;
        this.password = password;
        this.position= dateCreate;
    }
//    public Account(String account, String password,String dateCreate) {
//        this.account = account;
//        this.password = password;
//        this.dateCreate= dateCreate;
//    }

    public Account() {
        this.position = "";
        this.account = "";
        this.password = "";
        this.dateCreate= "";
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getPosition() {
        return position;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.account);
        hash = 67 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.account, other.account)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

    @Override
    public String toString() {
        return "Account{" + "position=" + position + ", account=" + account + ", password=" + password + ", dateCreate=" + dateCreate + '}';
    }

    public void editAccount(String pass, String position) {
        setPassword(pass);
        setPosition(position);
    }
    
    
    
    
   
    
    
}
