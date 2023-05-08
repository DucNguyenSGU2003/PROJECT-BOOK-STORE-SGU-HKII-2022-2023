/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author DELL
 */
public class Book {
    static int count=1000;
    
    private String ID;
    private String name;
    private String type;
    private String author;
    private String dateComposition;
    private String price;
    private String sourceIMG;
    private String dateCreate;
    private String ID_SUPPLIER;
    private String quanaty;
    private String details;

    public Book() {
        this.ID="";
        this.name = "";
        this.type = "";
        this.author = "";
        this.dateComposition = "";
        this.price = "";
        this.sourceIMG = "";
        this.dateCreate = "";
        this.ID_SUPPLIER= "";
        this.quanaty="";
        this.details="";
        
    }

    public Book(String name, String type, String author, String dateComposition, String price, String sourceIMG,String ID_SUPPLIER, String dateCreate, String quanaty,String details) {
//        BUS.upDateId.updateIDBook();
        count+=1;
        this.ID="BOO"+count;
        this.name = name;
        this.type = type;
        this.author = author;
        this.dateComposition = dateComposition;
        this.price = price;
        this.sourceIMG = sourceIMG;
        this.dateCreate = dateCreate;
        this.ID_SUPPLIER= ID_SUPPLIER;
        this.quanaty=quanaty;
        this.details=details;
    } 
            

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public Book(String ID, String name, String type, String author, String dateComposition, String price, String sourceIMG, String dateCreate, String ID_SUPPLIER,String quanaty,String details) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.author = author;
        this.dateComposition = dateComposition;
        this.price = price;
        this.sourceIMG = sourceIMG;
        this.dateCreate = dateCreate;
        this.ID_SUPPLIER = ID_SUPPLIER;
        this.quanaty=quanaty;
        this.details=details;
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

    @Override
    public String toString() {
        return "Book{" + "ID=" + ID + ", name=" + name + ", type=" + type + ", author=" + author + ", dateComposition=" + dateComposition + ", price=" + price + ", sourceIMG=" + sourceIMG + ", dateCreate=" + dateCreate + ", ID_SUPPLIER=" + ID_SUPPLIER + ", quanaty=" + quanaty + ", details=" + details + '}';
    }

    

    public String getID_SUPPLIER() {
        return ID_SUPPLIER;
    }

    public void setID_SUPPLIER(String ID_SUPPLIER) {
        this.ID_SUPPLIER = ID_SUPPLIER;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateComposition() {
        return dateComposition;
    }

    public void setDateComposition(String dateComposition) {
        this.dateComposition = dateComposition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuanaty() {
        return quanaty;
    }

    public void setQuanaty(String quanaty) {
        this.quanaty = quanaty;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSourceIMG() {
        return sourceIMG;
    }

    public void setSourceIMG(String sourceIMG) {
        this.sourceIMG = sourceIMG;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public void edit(String name, String type, String quanaty, String author,
            String price, String dateComposition, String IDSupplier, String details,String sourceIMG)
    {
        setName(name);
        setType(type);
        setQuanaty(quanaty);
        setAuthor(author);
        setPrice(price);
        setDateComposition(dateComposition);
        setID_SUPPLIER(IDSupplier);
        setDetails(details);
        setSourceIMG(sourceIMG);
    }
    
    
    
    
    
}
