/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Scanner;

/**
 *
 * @author naveen
 */
public class MonthNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month number");
        int month=sc.nextInt();
        if(month==2){
            System.out.print("28 days");
        }
        else{
            if(month%2==0){
                System.out.print("30 days"); 
            }
            else{
                System.out.print("31 days");
            }
        }
    }
}
