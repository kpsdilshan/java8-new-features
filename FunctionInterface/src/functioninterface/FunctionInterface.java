/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioninterface;

import java.util.function.Function;

/**
 *
 * @author Supun Dilshan
 */
public class FunctionInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("mkyong");   // 6

        System.out.println(apply);
    }
    
}
