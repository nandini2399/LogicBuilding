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
public class Base18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:  ");
        int count=0;
        String str=sc.nextLine();
        String str1 =str.toLowerCase();
        for(char i='a';i<='z';i++){
            count=0;
            for(int j=0;j<str1.length();j++){
                char ch=str1.charAt(j);
                if(ch==i){
                    count++;
                }
            }
            System.out.println(i+" : "+count);
        }
    }
    
}
