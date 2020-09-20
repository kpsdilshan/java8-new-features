/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8newfeatures;

/**
 *
 * @author Supun Dilshan
 */
@FunctionalInterface
public interface Interface1 {
    public void m1();
    
    default void m2(){}
    
    public static void m3(){}
}

@FunctionalInterface
interface I2 extends Interface1{
    
}