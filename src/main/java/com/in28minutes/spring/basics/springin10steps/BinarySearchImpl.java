package com.in28minutes.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {


    private SortAlgorithm sortAlgorithm;

    @Autowired
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        System.out.println("Using setter injection");
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch){
        //Sorting an array- BubbleSort
//        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

//        QuickSortAlgorithm quickSortAlgorithm =new QuickSortAlgorithm();

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        //Search the array

        //Return the result
        return 3;
    }

}
