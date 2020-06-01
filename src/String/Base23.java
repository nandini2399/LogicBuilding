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
public class Base23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter your name and marks:");
        int marks[]=new int[5];
        String name[]=new String[5];
        for(int i=0;i<5;i++){
            name[i]=sc.next();
            marks[i]=sc.nextInt();
        }
        System.out.println("Name"+" : "+"Marks");
        for(int i=0;i<5;i++){
            System.out.println(name[i]+" : "+marks[i]);
        }
        
    }
    
}
