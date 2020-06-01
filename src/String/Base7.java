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
public class Base7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a day");
        String day=sc.next();
        if(day.equalsIgnoreCase("Monday"))
            System.out.print("Day: "+"1");
        else if(day.equalsIgnoreCase("Tuesday"))
            System.out.print("Day: "+"2");
        else if(day.equalsIgnoreCase("Wednesday"))
            System.out.print("Day: "+"3");
     
        else if(day.equalsIgnoreCase("Thursday"))
            System.out.print("Day: "+"4");
        else if(day.equalsIgnoreCase("Friday"))
            System.out.print("Day: "+"5");
        else if(day.equalsIgnoreCase("Saturday"))
            System.out.print("Day: "+"6");
        else if(day.equalsIgnoreCase("Sunday"))
            System.out.print("Day: "+"7");
        
        
    }
    
}
