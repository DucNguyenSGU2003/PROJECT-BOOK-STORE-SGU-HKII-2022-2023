/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class Check_Error implements Check_Interface{

    @Override
    public boolean check_NumberPhone(String str) {
      Pattern p_Viettel=Pattern.compile("^03[2-9][0-9]{8}$");
      Pattern p_Mobifone=Pattern.compile("^07(0|9|7|6|8)[0-9]{7}$");
      Pattern p_Vinaphone=Pattern.compile("^08[1-5][0-9]{7}$");
      Pattern p_Vietnamobile=Pattern.compile("^05(6|8)[0-9]{7}$");
      Pattern p_Gmobile=Pattern.compile("^059[0-9]{7}$");
        if(p_Viettel.matcher(str).find()||
                p_Mobifone.matcher(str).find()||
                p_Vinaphone.matcher(str).find()||
                p_Vietnamobile.matcher(str).find()||
                p_Gmobile.matcher(str).find())
        {
            return true;
            
        }else
        {
            return false;
        }
    }
    public boolean check_BirthDay(String str) {
          Pattern p=Pattern.compile("^[0-9]{4}-[0-9]{2}-[0-9]{2}$");
        if(p.matcher(str).find() )  
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean check_ID(String str) {
          Pattern p_ID_12=Pattern.compile("^[0-9]{12}$");
          Pattern p_ID_16=Pattern.compile("^[0-9]{16}$");
        if(p_ID_12.matcher(str).find() || p_ID_16.matcher(str).find())
        {
            return true;
            
        }else
        {
            return false;
        }
    }

    @Override
    public boolean check_Bank_Account_Number(String str) {
       
          Pattern p_Viettel=Pattern.compile("^[0-9]{8,15}$");
        if(p_Viettel.matcher(str).find())
        {
            return true;
            
        }else
        {
            return false;
        }
        
    }
    
   

    @Override
    public boolean check_Email(String str) {
      Pattern p_email= Pattern.compile("^[a-zA-Z][a-zA-Z0-9\\-_]+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$");
      if(p_email.matcher(str).find())
      {
          return true;
      }
      else
      {
          return false;
      }
     
    }

    @Override
    public boolean check_PassWord(String str) {
        Pattern pDigit= Pattern.compile("^.*[0-9]+.*$");
        Pattern pUpcase= Pattern.compile("^.*[A-Z]+.*$");
        Pattern pLower= Pattern.compile("^.*[a-z]+.*$");
        Pattern pSpecial=Pattern.compile("^.*[#?!@$%^&*-]+.*$");
        Pattern pLenght= Pattern.compile("^.{8,}$");

        if(pDigit.matcher(str).find() && pUpcase.matcher(str).find() && pLower.matcher(str).find() && pLenght.matcher(str).find() && pSpecial.matcher(str).find() )
        {
            return true;
        }
        else
        {
            return false;   
        }
    }

    public static void main(String[] args) {
        
        Check_Error c = new Check_Error();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập: ");
        String str = sc.nextLine();
        
        if(c.check_BirthDay(str))
        {
            System.out.println("oke");
           
        }
        else
            System.out.println("not oke");
        
//        }else if(c.check_ID(str))
//        {
//            System.out.println("số cmnd");
//        }
//        else if(c.check_NumberPhone(str))
//        {
//            System.out.println("số điện thoại");
//        }
//        else System.out.println("ko là gì cả!");
                
    }

    @Override
    public boolean isNumber(String str) {
         try{
                    Double.parseDouble(str);
                    return true;
            } catch (NumberFormatException e) {
                    return false;
            }
    }
    
}
