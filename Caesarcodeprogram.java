/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caesarcode;

import java.util.Scanner;

/**
 *
 * @author ajee
 */




public class Caesarcodeprogram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine();
        System.out.println(" Enter the value : ");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++)
        {
             
            alphabet = plaintext.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {
             alphabet = (char) (alphabet + shift);
             
             if(alphabet > 'z') {
               
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
             else if(alphabet >= 'A' && alphabet <= 'Z')
            {
             alphabet = (char) (alphabet + shift);    
             if(alphabet > 'Z') {
             alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else
            {
             ciphertext = ciphertext + alphabet;  
            }
    }
    System.out.println(" ciphertext : " + ciphertext);
  }
}
 
