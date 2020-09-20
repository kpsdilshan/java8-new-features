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
public class Java8NewFeatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Interface2 i2 = ()-> System.out.println("This is a abstract method");
        i2.run();
        
        Interface3 i3 = (a,b)-> { System.out.println(a+b); };
        i3.sum(10, 5);
        i3.sum(14, 12);
        
        LengthGenerator i4 = s-> s.length();
        System.out.println(i4.genLength("kamal Hasan"));
        
        // without using lamba expressions
        Interface4 i5 = new child4();
        System.out.println(i5.squreIt(4));
        
        //with using lambda expressions
        Interface6 i6 = (x)-> x*x;
        System.out.println(i6.sqaureIt(10));
        
        
        
    }
    
}
