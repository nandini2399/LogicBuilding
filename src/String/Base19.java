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
public class Base19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String");
        char ch;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {   ch=str.charAt(i);
            if(ch==' '){
                System.out.print(" "+Character.toUpperCase(str.charAt(i+1)));
                i++;
            }
            else{
                System.out.print(ch);
            }
        }
        
        
    }
    
}
