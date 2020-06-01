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
public class base11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string");
        String str=sc.next();
        String x,y,z="";
        int i;
        String str1=str.toLowerCase();
        for(i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
            {
                break;
            }
            
        }
        x=str.substring(0, i);
        y=str.substring(i);
        z=x+y+"ay";
        System.out.print("Piglatin form: "+z);
        
        
        
    }
    
}
