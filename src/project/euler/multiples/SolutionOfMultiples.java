package project.euler.multiples;
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionOfMultiples {
    List<Integer> multiply = new ArrayList<Integer>();
    HashSet<Integer> set = new HashSet<Integer>();

    public void countTask(){
        findMultiplyOf( 3);
        findMultiplyOf( 5);
        set.addAll(multiply);
        sumTheResult(set);
    }
    private List<Integer> findMultiplyOf(int i) {

        for(int j = i ;  i < 1000;  i += j){
            multiply.add(i);

        }return multiply;
    }
    private static void sumTheResult(HashSet<Integer> set) {
        int result = 0;
        for(Integer element : set){
            result += element;

        }System.out.println(result);
    }
}
