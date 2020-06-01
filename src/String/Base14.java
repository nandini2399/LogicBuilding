/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author naveen
 */
public class Base14 {
    public static void main(String[] args){
        String s1="15 August is Independance day.";
        System.out.println(s1);
        String s2=s1.replaceAll("15", "26");
        String s3=s2.replaceAll("August", "January");
        String s4=s3.replaceAll("Independance", "Republic");
        System.out.println("Replaced string: "+s4);
    }
    
}
