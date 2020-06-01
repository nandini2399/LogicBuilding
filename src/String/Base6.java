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
public class Base6 { 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string");
        String s1=sc.next();
        System.out.print("Enter another string");
        String s2=sc.next();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        
    }
    
}
