/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringinvoking;

import java.util.Scanner;

/**
 *
 * @author ashwi
 */
public class Stringinvoking1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         email obj1= new email();
      obj1.fnread();
     obj1.fnGenerate();  
    } 
       
}
class email
{
     String fn, ln;
     Scanner s = new Scanner(System.in);
   
     public void fnread()
     {
          System.out.print("Enter first name : ");
          fn = s.next();
          System.out.print("Enter last name : ");
          ln = s.next();
     }
   
     public void fnGenerate()
     {
          if(fn.length()<3 || ln.length()<4)
              System.out.print("invalid input. Email id cannot be generated.");
          else
          {
              String emailid = fn.substring(0,3)+"."+ln.substring(0,4)+"@gmail.com";
              System.out.println("Email id : "+emailid);
          }
     }
}
 
