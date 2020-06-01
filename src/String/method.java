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
public class method { 
    int a=20; //instance variable
    static int b=10;
    
    void abc(int m){
            System.out.println(b);
            System.out.print(this.b);
}
    static void xyz(){
            System.out.print(b);
}
    public static void main(String[] args){
        method obj=new method();
        System.out.println(obj.a);
        System.out.print(b);
        xyz();
        obj.abc(30);
    }
    
}
