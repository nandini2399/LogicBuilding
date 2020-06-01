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
public class Base3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string");
        String word=sc.next();
        int count=0;
        for(int i=0;i<word.length();i++)
        {    char ch=word.charAt(i);
            if(ch>=65 && ch<=90)
            {
                count++;
            }
        }
        System.out.print(count); 
        
        
    }
    
}
