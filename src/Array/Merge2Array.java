/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author naveen
 */
public class Merge2Array {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int arr1[]={6,7,8,9,10};
        int arrf[]=new int[15];
        for(int i=0;i<5;i++){
            arrf[i]=arr[i];
        }
        for(int i=0;i<5;i++){
            arrf[i+5]=arr1[i];
        }
        for(int i=0;i<10;i++){
            System.out.print(arrf[i]);
        }
    }
}
