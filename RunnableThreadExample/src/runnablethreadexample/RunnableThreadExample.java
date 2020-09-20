/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnablethreadexample;

/**
 *
 * @author Supun Dilshan
 */
public class RunnableThreadExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread!");
            }
        };
        
        Thread t1 = new Thread(r1);
        t1.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }

}
