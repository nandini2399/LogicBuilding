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
public class Base5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string");
        int count=0;
        String line=sc.nextLine();
        char ch;
        for(int i=0; i<line.length();i++){
        ch= line.charAt(i);
        if(ch==' '){
            count++;
        }
        } System.out.print(count);
        
                
                
    }
    
}
