/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethodininterface;

/**
 *
 * @author Supun Dilshan
 */

interface LeftClass{
    default void m1(){
        System.out.println("left class");
    }
}

interface RightClass{
    default void m1(){
        System.out.println("Right class");
    }
}


public class DownClass implements LeftClass,RightClass{
    public void m1(){
//        System.out.println("DOwnclass implemented m1()");
        
        LeftClass.super.m1();
    }
}
