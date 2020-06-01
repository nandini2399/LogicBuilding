/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;
import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author naveen
 */
public class Base10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string");
        String str=sc.nextLine();
        String str1=str.substring(3, 20);
        System.out.println("Subtring of :"+str+"is :"+str1);
    }
    
}
