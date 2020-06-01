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
public class Base17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name");
        String name=sc.next();
        String name1=name.toLowerCase();
        for(int i=0;i<name1.length();i++){
            char ch=name1.charAt(i);
            if(i%2==0){
                System.out.print(Character.toUpperCase(ch));
              
            }
            else{
                System.out.print(ch);
            }
        }
        
    }
    
}
