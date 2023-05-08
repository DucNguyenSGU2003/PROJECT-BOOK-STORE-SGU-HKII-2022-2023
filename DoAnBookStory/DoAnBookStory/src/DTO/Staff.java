/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author DELL
 */
public class Staff {

    public static int count = 1000;
    private String ID;
    private String accountStr;
    private String name;
    private String sex;
    private String birthDay;
    private String Phone;
    private String bankAccount;
    private String bankName;
    private String salary;
    private String bonus;
    private Account account;
    private String address;
    private String email;
    private String CCCD;
    private String dateCreate;
    public Staff(String accountStr, String name, String sex, String birthDay, String address, String Phone, String bankAccount, String bankName, String email, String CCCD, String salary, String bonus, String dateCreate) {
        count++;
        this.ID = "Sta" + count;
        this.CCCD = CCCD;
        this.accountStr = accountStr;
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
        this.Phone = Phone;
        this.bankAccount = bankAccount;
        this.bankName = bankName;
        this.salary = salary;
        this.bonus = bonus;
        this.address = address;
        this.email = email;
        this.dateCreate = dateCreate;
    }
    public Staff(String id,String accountStr, String name, String sex, String birthDay, String address, String Phone, String bankAccount, String bankName, String email, String CCCD, String salary, String bonus, String dateCreate,Account acc) {
        this.ID = id;
        this.CCCD = CCCD;
        this.accountStr = accountStr;
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
        this.Phone = Phone;
        this.bankAccount = bankAccount;
        this.bankName = bankName;
        this.salary = salary;
        this.bonus = bonus;
        this.address = address;
        this.email = email;
        this.dateCreate = dateCreate;
        this.account=acc;
    }
    

    public Staff() {
        count++;
        this.ID = "Sta" + count;
        this.CCCD = "";
        this.accountStr = "";
        this.name = "chưa khởi tạo";
        this.sex = "";
        this.birthDay = "";
        this.Phone = "";
        this.bankAccount = "";
        this.bankName = "";
        this.salary = "";
        this.bonus = "";
        this.address = "";
        this.email = "";
        this.account = new Account();
        this.dateCreate = "";
    }

    public void editStaff(String address, String bonus, String email, String name, String phone, String salary, String position) {

        setAddress(address);
        setBonus(bonus);
        setEmail(email);
        setName(name);
        setPhone(phone);
        setSalary(salary);
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Staff(String accountStr, String name, String sex, String birthDay, String address, String Phone, String bankAccount, String bankName, String email, String CCCD, String salary, String bonus, Account acc, String dateCreate) {
        count++;
        this.ID = "Sta" + count;
        this.accountStr = accountStr;
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
        this.Phone = Phone;
        this.bankAccount = bankAccount;
        this.bankName = bankName;
        this.salary = salary;
        this.bonus = bonus;
        this.address = address;
        this.account = acc;
        this.email = email;
        this.CCCD = CCCD;
        this.dateCreate = dateCreate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Staff.count = count;
    }

    public String getNameBank() {
        return bankName;
    }

    public void setNameBank(String nameBank) {
        this.bankName = nameBank;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getAccountStr() {
        return accountStr;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public void setAccountStr(String accountStr) {
        this.accountStr = accountStr;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Staff{" + "ID=" + ID + ", accountStr=" + accountStr + ", name=" + name + ", sex=" + sex + ", birthDay=" + birthDay + ", Phone=" + Phone + ", bankAccount=" + bankAccount + ", bankName=" + bankName + ", salary=" + salary + ", bonus=" + bonus + ", account=" + account + ", address=" + address + '}';
    }

    public void editStaff(String address, String bankAccount, String bonus, String email, String name, String phone, String salary, String bankName) {
        setAddress(address);
        setBankAccount(bankAccount);
        setBonus(bonus);
        setEmail(email);
        setName(name);
        setPhone(phone);
        setSalary(salary);
        setBankName(bankName);
    }

}
