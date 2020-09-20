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
interface Inter1{
    default void run(){
        System.out.println("run method in Inter1 interface");
    }
}

class Test implements Inter1{
    
}


public class DefaultMethodInInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.run();
        
        //mutiple inheritance in default methods
        DownClass dc = new DownClass();
        dc.m1();
      
    }
    
}
