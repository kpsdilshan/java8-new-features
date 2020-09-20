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

/**
 *    WITHOUT LAMBDA EXPRESSIONS
 */

@FunctionalInterface
public interface Interface4 {
    public int squreIt(int x);
}


class child4 implements Interface4{

    @Override
    public int squreIt(int x) {
        return x*x;
    }

}