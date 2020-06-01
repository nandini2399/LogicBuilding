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
public class Base21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st="";
        System.out.print("Enter string: ");
        String line=sc.nextLine();
        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            while(ch!=' '){
             
             st=st+line.charAt(i);
             
              
                
            }
            
            checkpalindrome(st);
            st="";
            
        }
    }
    static void checkpalindrome(String st){
        String rev="";
        for(int i=st.length()-1;i>0;i--){
            rev=rev+st.charAt(i);
        }
        if(rev.equalsIgnoreCase(st)){
            System.out.print(st+"is a palindrome");
            return;
        }
        else{
          return;  
        }
    }

}
