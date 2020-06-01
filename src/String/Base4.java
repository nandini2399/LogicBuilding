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
public class Base4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count =0;
        System.out.print("Enter a string");
        String name=sc.next();
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            
            switch(ch){
                case 'a': count++; break;
                case 'e': count++; break;
                case 'i': count++; break;
                case 'o': count++; break;
                case 'u': count++; break;
                case 'A': count++; break;
                case 'E': count++; break;
                case 'I': count++; break;
                case 'O': count++; break;
                case 'U': count++; break;
            }
            
            
        }
        System.out.print("Total number of vowels present: "+count);
    }
    
}
