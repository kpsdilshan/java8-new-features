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
public class ChainFunction {
    public static void chain(){
        Function<String, Integer> func = x -> x.length();

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("mkyong");   // 12

        System.out.println(result);

    }
}
