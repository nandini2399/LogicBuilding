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
public class Base2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name1,name2,name3;
        System.out.print("Enter your first name");
        name1=sc.next();
        System.out.print("Enter your middle name");
        name2=sc.next();
        System.out.print("Enter your last name");
        name3=sc.next();
        System.out.println("Full Name: "+ name1 + name2 + name3);
        System.out.println("Short Name:  "+ name1.charAt(0) + name2.charAt(0)+ name3.charAt(0);
    }
    
}
