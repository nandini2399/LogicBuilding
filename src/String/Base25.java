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
public class Base25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name and marks");
        String name[]=new String[5];
        int temp=0;
        String var="";
        int marks[]=new int[5];
        for(int i=0;i<5;i++){
            name[i]=sc.next();
            marks[i]=sc.nextInt();
        }
        int highscore=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(marks[i]<marks[j]){
                    temp=marks[i];
                    marks[i]=marks[j];
                    marks[j]=temp;
                    var=name[i];
                    name[i]=name[j];
                    name[j]=var;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(marks[i]+" "+name[i]);
        }
    }
    
}
