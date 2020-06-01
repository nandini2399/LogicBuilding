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
public class Base12 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();
        String str1=str.toLowerCase();
        if(str1.startsWith("mr")){
            System.out.print("Male");
           
        }
        else if(str1.startsWith("miss")){
            System.out.print("Female");
        }
        else if(str1.startsWith("mrs")){
            System.out.print("Married Female");
        }
        else if(str1.endsWith("kumari")){
            System.out.print("Female");
        }
        else{
            System.out.print("Cannot Determine");
        }
    }
    
}
