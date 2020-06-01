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
public class Base24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String country[]= {"India","France","Italy","Japan","Dubai"};
        String wonder[]={"Yumthang Valley,Sikkim","Honfleur,Normandy","Florence","Chureito Pagoda at Mount Fuji","Burj Khalifa"};
        System.out.println("Enter country name to know its place of wonder");
        String cname=sc.next();
        for(int i=0;i<5;i++)
        {
            if(cname.equalsIgnoreCase(country[i])){
                System.out.print(": "+wonder[i]);
            }
    }
        
    }
    
}
