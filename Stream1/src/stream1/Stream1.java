/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Supun Dilshan
 */
public class Stream1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(18);
        list.add(71);
        list.add(2);
        
        List<Integer> collect  =  list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        
        long numbers = list.stream()
                .filter(n->n%2==0)
                .count();
        
        List<Integer> doubleValue =  list.stream()
                .map(n-> n*2)
                .collect(Collectors.toList());
        
        System.out.println(collect);
        System.out.println(numbers);
        System.out.println(list);
        System.out.println(doubleValue);
        
        
        Integer min = list.stream()
                .min((i1,i2)-> i1.compareTo(i2))
                .get();
        System.out.println(min);
        
        Integer max = list.stream()
                .max((i1,i2)-> i1.compareTo(i2))
                .get();
        System.out.println(max);
        
    }
    
}
