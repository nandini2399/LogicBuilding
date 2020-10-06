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
public class ArrayAverage {
     public static void main(String[] args){
        System.out.print("Enter the length of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[20];
        int count=0;
        System.out.println("Enter numbers of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            count+=arr[i];
        }
        System.out.println("Average of array is : "+count/n);
     }
}
