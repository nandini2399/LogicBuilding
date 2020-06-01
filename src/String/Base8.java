/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;
import java.util.Scanner;
import java.lang.Character;
/**
 *
 * @author naveen
 */
public class Base8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
       
        System.out.print("Enter a string:");
        String word=sc.next();
        for(int i=0;i<word.length();i++){
            
        
        char x=word.charAt(i);
       
        if(Character.isLowerCase(x)){
        
            char y=Character.toUpperCase(x);
            System.out.print(y);
            
            }
        else{
            char z=Character.toLowerCase(x);
            System.out.print(z);
        }
            
        }
    }
    
}
