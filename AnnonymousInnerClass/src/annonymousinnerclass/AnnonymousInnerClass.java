/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annonymousinnerclass;

interface I1{
   public void run();
}
/**
 *
 * @author Supun Dilshan
 */
public class AnnonymousInnerClass {
    
    int x = 8888;
    
    public static void main(String[] args) {
        Runnable r1 = new Runnable  () {
            @Override
            public void run() {
                System.out.println("yeah");
            }
        };
        
        r1.run();
        
        //annonymous inner class for test interface
        Test t1 = new Test() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }

            @Override
            public void m3() {
                System.out.println("m3");
            }
        };
        
        //annonymous inner class 
        I1 i1 = new I1(){
           int x = 777;

            @Override
            public void run() {
                System.out.println(this.x);
            } 
        };
        
        i1.run();
            
    }
    
}
