package project.euler.multiples;
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

import java.util.ArrayList;
import java.util.List;

public class SolutionTaskOfMultiples {

    public static void main(){
        findMultiplyOf( 3);
        findMultiplyOf( 5);
        sumTheResult();


    }



    private static void findMultiplyOf(int i) {
        List<Integer> multiply = new ArrayList<Integer>();



        for( ;  i < 1000;  i += i){
            multiply.add(i);


        }
    }


    private static void sumTheResult() {

    }

}
