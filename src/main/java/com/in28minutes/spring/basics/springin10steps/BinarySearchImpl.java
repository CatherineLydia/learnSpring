package com.in28minutes.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;

    //no constructor- no setter injection


    public int binarySearch(int[] numbers, int numberToSearch){

        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);
        //Search the array

        //Return the result
        return 3;
    }

}
