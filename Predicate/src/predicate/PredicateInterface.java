/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

/**
 *
 * @author Supun Dilshan
 */
public class PredicateInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6,4,6,5,8);
        List<Integer> collect = list.stream()
                .filter(r->r>4)
                .collect(Collectors.toList());
        System.out.println(collect);
        
        Predicate<Integer> noGreaterThan5 =  x -> x > 5;
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect2 = list1.stream()
                .filter(noGreaterThan5)
                .collect(Collectors.toList());
        System.out.println(collect2);
        
        //predicate with .or 
        PredicateWithOr.test();
    }
    
}
