/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreference;

/**
 *
 * @author Supun Dilshan
 */


interface Inter{
    public void m1();
}

public class MethodReference {
    
    public static void m2(){
        System.out.println("m2 method reference");
    }
    
    public static void main(String[] args) {
        
        Inter it1 = MethodReference::m2;
        it1.m1();
    }
    
}
