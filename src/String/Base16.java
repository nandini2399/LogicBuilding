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
public class Base16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("Enter 5 names");
        String arr[]=new String[5];
        for(i=0;i<5;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("Names starting from vowels are: ");
        
        for(int j=0;j<5;j++){
            char ch=arr[j].charAt(0);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='o'||ch=='U'){
                System.out.println(arr[j]);
            }
            
            
            
        }
        
    }
    
}
