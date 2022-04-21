package com.in28minutes.spring.basics.springin10steps;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
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
