/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Supun Dilshan
 */
public class PredicateWithOr {
    public static void test(){
          Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect = list.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
