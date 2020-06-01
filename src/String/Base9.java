/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;
import java.util.Scanner;

/**
 *
 * @author naveen
 */
public class Base9 {
    public static void main(String[] args)
    {   String rev=""; 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string");
        String str=sc.next(); 
        
        for(int i=str.length()-1;i>=0;i--)
        {   
            rev =rev+ str.charAt(i);
            
        }
        if(rev.equalsIgnoreCase(str)){
            System.out.print("Given string "+str+" is a palindrome");
        }
        else{
            System.out.print("Given string "+str+" is not a palindrome");
        }
        
        
    }
    
}
