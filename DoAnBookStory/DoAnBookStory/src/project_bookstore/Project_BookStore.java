/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_bookstore;
import GUI.LoginFRM ;
/**
 *
 * @author DELL
 */
public class Project_BookStore {
    private LoginFRM BookStore ;
    public Project_BookStore(){
        BookStore = new LoginFRM();
        BookStore.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Project_BookStore();
    }
    
}
