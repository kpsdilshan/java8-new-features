/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bipredicateinterface;

import java.util.function.BiPredicate;

/**
 *
 * @author Supun Dilshan
 */
public class BiPredicateInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("mkyong", 6);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false
    }
}
